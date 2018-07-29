package com.example.owner.gymbmi;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button btnLogin;
    Button btnRegister;
    EditText lgUsername, lgPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lgUsername=(EditText)findViewById(R.id.etUsername);
        lgPass=(EditText)findViewById(R.id.etPassword);
        btnLogin=(Button)findViewById(R.id.blogin);
        btnRegister=(Button)findViewById(R.id.bregister);
        openHelper=new Database(this);
        db = openHelper.getReadableDatabase();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = lgUsername.getText().toString();
                String pass = lgPass.getText().toString();

                cursor = db.rawQuery("SELECT *FROM " + Database.TABLE_NAME + " WHERE " + Database.COL_1 + "=? AND " + Database.COL_3 + "=?", new String[]{username, pass});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void ButtonClick(View v){
        if(v.getId()== R.id.bregister){
            Intent i =new Intent(Login.this,Register.class);
            startActivity(i);
        }
    }

}
