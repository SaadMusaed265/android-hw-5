package com.example.deafan;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText e2m;
    private EditText e3m;
    private EditText e4m;
    private EditText e5m;
    private EditText e6m;
    private Button e1m;
    private String ST;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button knafa = findViewById(R.id.e1m);
        e2m=findViewById(R.id.e2m);
        e3m=findViewById(R.id.e3m);
        e4m= findViewById(R.id.e4m);
        e5m = findViewById(R.id.e4m);
        e6m =  findViewById(R.id.e6m);
        e1m =  findViewById(R.id.e1m);









        knafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
                ST=e2m.getText().toString();
                i.putExtra("Value",ST);
                startActivity(i);
                finish();
                ST=e3m.getText().toString();
                i.putExtra("Value1",ST);
                startActivity(i);
                finish();

                ST=e4m.getText().toString();
                i.putExtra("Value2",ST);
                startActivity(i);
                finish();

                ST=e5m.getText().toString();
                i.putExtra("Value3",ST);
                startActivity(i);
                finish();

                ST=e6m.getText().toString();
                i.putExtra("Value4",ST);
                startActivity(i);
                finish();







            }
        });


    }
}