package com.sample.applicationlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button tv = findViewById(R.id.textView);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        tv.setText(result+" 클릭하셨습니다.");

    }
}