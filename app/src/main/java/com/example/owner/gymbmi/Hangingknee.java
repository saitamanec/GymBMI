package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Hangingknee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangingknee);
        ImageView iv = (ImageView)findViewById(R.id.imgview8);
        iv.setImageResource(R.drawable.hangingkneeraise);
    }
}
