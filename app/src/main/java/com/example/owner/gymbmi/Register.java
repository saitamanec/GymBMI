package com.example.owner.gymbmi;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Database myDb;
    EditText editUsername,editEmail,editPassword,editGender,editBirth,editCountry;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myDb = new Database(this);

        editUsername = (EditText)findViewById(R.id.Username);
        editEmail = (EditText)findViewById(R.id.Email);
        editPassword = (EditText)findViewById(R.id.Password);
        editGender = (EditText)findViewById(R.id.Genderrr);
        editBirth = (EditText)findViewById(R.id.Birth);
        editCountry = (EditText)findViewById(R.id.Country);
        btnRegister = (Button)findViewById(R.id.bRegister);
        Register();

    }

    public  void Register() {
        btnRegister.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editUsername.getText().toString(),
                                editEmail.getText().toString(),
                                editPassword.getText().toString(),editGender.getText().toString(),
                                editBirth.getText().toString()
                                ,editCountry.getText().toString());

                        if (isInserted == true )
                            Toast.makeText(Register.this, "Register success", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Register.this, "Register failed", Toast.LENGTH_LONG).show();

                        editUsername.setText("");
                        editPassword.setText("");
                        editEmail.setText("");
                        editGender.setText("");
                        editBirth.setText("");
                        editCountry.setText("");
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void DoneClick(View v) {
        if (v.getId() == R.id.bDone) {
            Intent i = new Intent(Register.this, Login.class);
            startActivity(i);
        }
    }
}