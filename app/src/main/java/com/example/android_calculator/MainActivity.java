package com.example.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText input,result;
    String currentInput="",buttonInput,operator;
    Double operand1,operand2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.et1);
        result=findViewById(R.id.et2);
    }

    public void digit(View view) {
        Button b1=(Button) view;
        currentInput=input.getText().toString();
        buttonInput=b1.getText().toString();
        input.setText(currentInput + buttonInput);
    }

    public void operator(View view) {
        Button b2=(Button) view;
        operator=b2.getText().toString();
        operand1=Double.parseDouble(input.getText().toString());
        input.setText("");
    }

    public void equals(View view) {
        operand2=Double.parseDouble(input.getText().toString());
        switch (operator){
            case "+":
                Double sum=operand1 + operand2;
                result.setText(String.valueOf(sum));
                break;
            case "-":
                Double sub= operand1 - operand2;
                result.setText(String.valueOf(sub));
                break;
            case "*":
                Double mul=operand1 * operand2;
                result.setText(String.valueOf(mul));
                break;
            case "/":
                Double div=operand1 / operand2;
                result.setText(String.valueOf(div));
                break;
        }
    }

    public void clear(View view) {
        input.setText("");
        result.setText("");
    }
}