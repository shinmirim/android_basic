package com.sample.calculator;
import android.app.Activity;
import android.os.Bundle;

import android.view.MotionEvent;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;

    Button btnAdd;

    Button btn2;

    Button btn3;

    Button btn4;

    TextView textResult;

    String num1, num2;

    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");



        edit1 = (EditText) findViewById(R.id.edit1);

        edit2 = (EditText) findViewById(R.id.edit2);



        btnAdd = (Button) findViewById(R.id.BtnAdd1);



        textResult = (TextView) findViewById(R.id.TextResult);



        btnAdd.setOnTouchListener(new View.OnTouchListener() {



            public boolean onTouch(View arg0, MotionEvent arg1) {

                num1 = edit1.getText().toString();

                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);

                textResult.setText("계산 결과 : " + result.toString());



                return false;

            }

        });







        btn2 = (Button) findViewById(R.id.Btn2);
        textResult = (TextView) findViewById(R.id.TextResult);
        btn2.setOnTouchListener(new View.OnTouchListener() {



            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());



                return false;

            }

        });





        btn3 = (Button) findViewById(R.id.Btn3);

        textResult = (TextView) findViewById(R.id.TextResult);
        btn3.setOnTouchListener(new View.OnTouchListener() {


            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);

                textResult.setText("계산 결과 : " + result.toString());



                return false;

            }

        });



        btn4 = (Button) findViewById(R.id.Btn4);
        textResult = (TextView) findViewById(R.id.TextResult);
        btn4.setOnTouchListener(new View.OnTouchListener() {



            public boolean onTouch(View arg0, MotionEvent arg1) {

                num1 = edit1.getText().toString();

                num2 = edit2.getText().toString();
                //result = Integer.parseInt(num1) / Integer.parseInt(num2);
                result = (int)Math.round(Double.parseDouble(num1) / Double.parseDouble(num2));

                textResult.setText("계산 결과 : " + result.toString());



                return false;

            }

        });







    }

}










