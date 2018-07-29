package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Calfraise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calfraise);
        ImageView iv = (ImageView)findViewById(R.id.imgview15);
        iv.setImageResource(R.drawable.calfraise);
    }
}
