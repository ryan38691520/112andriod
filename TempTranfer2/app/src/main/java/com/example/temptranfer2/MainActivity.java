package com.example.temptranfer2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void button_Click(View view)
    {
        EditText etdTemp = (EditText) findViewById(R.id.etdTemp);
        TextView txtShow = (TextView) findViewById(R.id.txvShow2);
        double degreeC = Double.parseDouble(etdTemp.getText().toString());
        double degreeF = (9.0 * degreeC)/5.0 +32.0;

        txtShow.setText("華氏溫度"+degreeF);
    }
}
