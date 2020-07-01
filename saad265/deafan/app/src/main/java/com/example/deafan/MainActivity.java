package com.example.deafan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B1 =  findViewById(R.id.B1);
        Button NEXT = findViewById(R.id.B1);

        NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NEXT = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(NEXT);


            }
        });
    }
}



