package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Barbellsquat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbellsquat);
        ImageView iv = (ImageView)findViewById(R.id.imgview14);
        iv.setImageResource(R.drawable.barbellsquat);
    }
}
