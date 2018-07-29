package com.example.owner.gymbmi;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.frag1;
import layout.frag2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ChgBMI(View v) {
        if(v.getId()== R.id.BMIbutton){
            Intent i =new Intent(MainActivity.this,BMICalculate.class);
            startActivity(i);
        }
    }

    public void ChgGYM(View v) {
        if(v.getId()== R.id.GYMbutton){
            Intent i =new Intent(MainActivity.this,GYM.class);
            startActivity(i);
        }
    }


    public void chgfrg(View view){
        Fragment fragment;

        if(view == findViewById(R.id.btn1)) {
            fragment = new frag1();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragplace,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.btn2)) {
            fragment = new frag2();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragplace,fragment);
            ft.commit();
        }
    }
}
