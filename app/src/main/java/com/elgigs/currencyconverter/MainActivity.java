package com.elgigs.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;
    double vdollar,veuro,vyen,vruble;
    double val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        et=findViewById(R.id.et);
        vdollar=0.014;
        veuro=0.012;
        vyen=1.53;
        vruble=0.94;
    }

    public void dollar(View v) {
        String check = et.getText().toString();
        if (check.length() > 0) {
            val = Float.parseFloat(et.getText()+"");
            tv.setText(val*vdollar+"$");
        }
        else {
            tv.setText("");
        }
    }
    public void euro(View v) {
        String check = et.getText().toString();
        if (check.length() > 0) {
            val = Float.parseFloat(et.getText()+"");
            tv.setText(val*veuro+"€");
        }
        else {
            tv.setText("");
        }
    }
    public void yen(View v) {
        String check = et.getText().toString();
        if (check.length() > 0) {
            val = Float.parseFloat(et.getText()+"");
            tv.setText(val*vyen+"¥");
        }
        else {
            tv.setText("");
        }
    }
    public void ruble(View v) {
        String check = et.getText().toString();
        if (check.length() > 0) {
            val = Float.parseFloat(et.getText()+"");
            tv.setText(val*vruble+"\u20BD");
        }
        else {
            tv.setText("");
        }
    }

}
