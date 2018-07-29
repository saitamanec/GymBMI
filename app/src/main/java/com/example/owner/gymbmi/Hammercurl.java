package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Hammercurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hammercurl);
        ImageView iv = (ImageView)findViewById(R.id.imgview2);
        iv.setImageResource(R.drawable.inclinehammercurls);
    }
}
