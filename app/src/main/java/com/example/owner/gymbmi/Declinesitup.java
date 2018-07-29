package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Declinesitup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declinesitup);
        ImageView iv = (ImageView)findViewById(R.id.imgview9);
        iv.setImageResource(R.drawable.declinesitup);

    }
}
