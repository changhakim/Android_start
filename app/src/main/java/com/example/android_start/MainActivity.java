package com.example.android_start;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){
                    case "+":break;
                }
            }
            int getNum(){return num;}
            void setNum(){this.num=num;}
        }

        Button minus = findViewById(R.id.minus);
        Button percent = findViewById(R.id.percent);
        Button  multiple = findViewById(R.id.multiple);
        Button division = findViewById(R.id.division);
        final Button equal = findViewById(R.id.equal);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sum = int1 + int2;
                Calc c = new Calc();

            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt( num2.getText().toString());
                //sum = int1 + int2;

            }
        });
        findViewById(R.id.percent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt( num2.getText().toString());
                //sum = int1 + int2;

            }
        });
        findViewById(R.id.multiple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt( num2.getText().toString());
                //sum = int1 + int2;

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText();
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
