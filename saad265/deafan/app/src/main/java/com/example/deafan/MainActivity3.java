package com.example.deafan;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView e1m;
    private TextView e2m;
    private TextView e3m;
    private TextView e4m;
    private TextView e5m;
    private String ST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e1m =  findViewById(R.id.e1m);
        e2m =  findViewById(R.id.e2m);
        e3m =  findViewById(R.id.e3m);
        e4m =  findViewById(R.id.e4m);
        e5m =  findViewById(R.id.e5m);

        Bundle i = getIntent().getExtras();


        e1m.setText(i.getString("Value"));

        e2m.setText(i.getString("Value1"));

        e3m.setText(i.getString("Value2"));

        e4m.setText(i.getString("Value3"));

        e5m.setText(i.getString("Value4"));




    }
}