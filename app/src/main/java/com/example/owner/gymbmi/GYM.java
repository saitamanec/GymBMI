package com.example.owner.gymbmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GYM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
    }

    public void Biceps1(View v) {
        if(v.getId()== R.id.bic1){
            Intent i =new Intent(GYM.this,Barbellcurls.class);
            startActivity(i);
        }
    }

    public void Biceps2(View v) {
        if(v.getId()== R.id.bic2){
            Intent i =new Intent(GYM.this,Hammercurl.class);
            startActivity(i);
        }
    }

    public void Biceps3(View v) {
        if(v.getId()== R.id.bic3){
            Intent i =new Intent(GYM.this,Peachercurl.class);
            startActivity(i);
        }
    }

    public void Tricep1(View v) {
        if(v.getId()== R.id.tri1){
            Intent i =new Intent(GYM.this,Onearmpress.class);
            startActivity(i);
        }
    }

    public void Tricep2(View v) {
        if(v.getId()== R.id.tri2){
            Intent i =new Intent(GYM.this,Closegripbeach.class);
            startActivity(i);
        }
    }

    public void Tricep3(View v) {
        if(v.getId()== R.id.tri3){
            Intent i =new Intent(GYM.this,Barbellpress.class);
            startActivity(i);
        }
    }

    public void Abs1(View v) {
        if(v.getId()== R.id.abs1){
            Intent i =new Intent(GYM.this,forearmplank.class);
            startActivity(i);
        }
    }
    public void Abs2(View v) {
        if(v.getId()== R.id.abs2){
            Intent i =new Intent(GYM.this,Hangingknee.class);
            startActivity(i);
        }
    }
    public void Abs3(View v) {
        if(v.getId()== R.id.abs3){
            Intent i =new Intent(GYM.this,Declinesitup.class);
            startActivity(i);
        }
    }

    public void Chest1(View v) {
        if(v.getId()== R.id.che1){
            Intent i =new Intent(GYM.this,Dumbellfly.class);
            startActivity(i);
        }
    }

    public void Chest2(View v) {
        if(v.getId()== R.id.che2){
            Intent i =new Intent(GYM.this,Smithmachine.class);
            startActivity(i);
        }
    }

    public void Chest3(View v) {
        if(v.getId()== R.id.che3){
            Intent i =new Intent(GYM.this,Declinebench.class);
            startActivity(i);
        }
    }

    public void Leg1(View v) {
        if(v.getId()== R.id.lg1){
            Intent i =new Intent(GYM.this,Narrowleg.class);
            startActivity(i);
        }
    }

    public void Leg2(View v) {
        if(v.getId()== R.id.lg2){
            Intent i =new Intent(GYM.this,Barbellsquat.class);
            startActivity(i);
        }
    }

    public void Leg3(View v) {
        if(v.getId()== R.id.lg3){
            Intent i =new Intent(GYM.this,Calfraise.class);
            startActivity(i);
        }
    }
}
