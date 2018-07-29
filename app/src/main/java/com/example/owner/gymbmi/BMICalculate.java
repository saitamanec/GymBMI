package com.example.owner.gymbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMICalculate extends AppCompatActivity {
    EditText BMIHeight,BMIWeight;
    TextView finalresult;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculate);
    }

    public void BMIcalculateClick(View v) {
        BMIHeight = (EditText) findViewById(R.id.BMIHeight);
        BMIWeight = (EditText) findViewById(R.id.BMIWeight);
        finalresult = (TextView) findViewById(R.id.result333);

        btnCalc = (Button) findViewById(R.id.bCalculate);

        if (v.getId() == R.id.bCalculate) {
            float height = Float.parseFloat(BMIHeight.getText().toString());
            float weight = Float.parseFloat(BMIWeight.getText().toString());
            float result1 = (weight / height)/height;
            String result2 = String.format("%.2f", result1);
            finalresult.setText(result2);
        }

    }
}
