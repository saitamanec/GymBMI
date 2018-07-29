package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Declinebench extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declinebench);
        ImageView iv = (ImageView)findViewById(R.id.imgview12);
        iv.setImageResource(R.drawable.declinebarbell);
    }
}
