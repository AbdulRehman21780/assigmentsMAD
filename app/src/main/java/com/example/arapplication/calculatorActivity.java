package com.example.arapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculatorActivity extends AppCompatActivity {
    EditText no1;
    EditText no2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_calculator);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        no1 = findViewById(R.id.editText1);
        no2 = findViewById(R.id.editText2);
        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);
        Result = findViewById(R.id.textView);

//        Add.setOnClickListener(this);
//        Sub.setOnClickListener(this);
//        Mul.setOnClickListener(this);
//        Div.setOnClickListener(this);
    }


    public void onClick(View v) {
        float num1 = Float.parseFloat(no1.getText().toString());
        float num2 = Float.parseFloat(no2.getText().toString());
        float result = 0;
        String oper = "";

        if (v.getId() == R.id.Add) {
            oper = "+";
            result = num1 + num2;
        } else if (v.getId() == R.id.Sub) {
            oper = "-";
            result = num1 - num2;
        } else if (v.getId() == R.id.Mul) {
            oper = "*";
            result = num1 * num2;
        } else if (v.getId() == R.id.Div) {
            oper = "/";
            result = num1 / num2;
        }

        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
