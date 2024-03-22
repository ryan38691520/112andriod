package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txvShow = (TextView) findViewById(R.id.lblOutput);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txvShow = (TextView) findViewById(R.id.lblOutput);
        txvShow.setTextSize(36);
        Button btnClac = (Button) findViewById(R.id.button);
        Button btnClear = (Button) findViewById(R.id.button2);
        btnClac.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        EditText edtHeight = (EditText) findViewById(R.id.editTextNumber);
        EditText edtWeight = (EditText) findViewById(R.id.editTextNumber2);

        if(v.getId() == R.id.button)
        {
            double height = Double.parseDouble(edtHeight.getText().toString());
            double weight = Double.parseDouble(edtWeight.getText().toString());
            double bmi = weight/ Math.pow(height/100.0 , 2);
            if(bmi>=24)
                txvShow.setTextColor(Color.RED);
            else if(bmi<18.5)
                txvShow.setTextColor(Color.BLUE);
            else
                txvShow.setTextColor(Color.GREEN);

            txvShow.setText(String.format("%.2f", bmi));
        }
        else
        {
            edtHeight.setText("0");
            edtWeight.setText("0");
            txvShow.setText("0");
        }
    }
}