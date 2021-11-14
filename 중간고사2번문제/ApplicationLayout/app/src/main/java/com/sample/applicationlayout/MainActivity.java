package com.sample.applicationlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("result",button1.getText());

                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("result",button2.getText());

                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
                String result1 = "";
                String result2 = "";
                if(check1.isChecked()){
                    result1 = check1.getText().toString();
                }
                if(check2.isChecked()){
                    result2 = check2.getText().toString();
                }
                Toast.makeText(getApplicationContext(),result1+" "+result2,Toast.LENGTH_LONG).show();
            }
        });
    }
}