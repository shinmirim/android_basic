package com.sample.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button tv = findViewById(R.id.textView);

        Intent intent = getIntent();
        String year = intent.getStringExtra("year");
        String month = intent.getStringExtra("month");
        String day = intent.getStringExtra("day");
        String hour = intent.getStringExtra("hour");
        String minute = intent.getStringExtra("minute");

        if(intent.hasExtra("year") && !year.equals("0") ){
            tv.setText(year+"년 "+
                    month+"월 "+day+"일 "+hour+"시 "+minute+"분 예약완료");
        }
        else{
            tv.setText("날짜를 다시 선택하고 실행해주세요.");
        }


    }
}