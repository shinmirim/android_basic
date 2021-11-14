package com.sample.reservation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;


import com.sample.reservation.R;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button btnStart, btnEnd;
    RadioButton rBtnCalendar, rBtnTime;
    CalendarView calView;
    TimePicker tPicker;
    int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnEnd = (Button) findViewById(R.id.btnEnd);

        chrono = (Chronometer) findViewById(R.id.chronometer);

        rBtnCalendar = (RadioButton) findViewById(R.id.rBtnCalendar);
        rBtnTime = (RadioButton) findViewById(R.id.rBtnTime);

        tPicker = (TimePicker) findViewById(R.id.timePicker);
        calView = (CalendarView) findViewById(R.id.calendarView);

        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        rBtnCalendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tPicker.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.VISIBLE);
            }
        });

        rBtnTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calView.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.VISIBLE);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                Toast.makeText(getApplicationContext(),
                        Integer.toString(selectYear) + "년 "+
                        Integer.toString(selectMonth) + "월 "+
                        Integer.toString(selectDay) + "일 "+
                        Integer.toString(tPicker.getCurrentHour())+"시 "+
                        Integer.toString(tPicker.getCurrentMinute()) + "분 선택"
                ,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("year",Integer.toString(selectYear));
                intent.putExtra("month",Integer.toString(selectMonth));
                intent.putExtra("day",Integer.toString(selectDay));
                intent.putExtra("hour",Integer.toString(tPicker.getCurrentHour()));
                intent.putExtra("minute",Integer.toString(tPicker.getCurrentMinute()));
                startActivity(intent);

            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month+1;
                selectDay = dayOfMonth;
            }
        });


    }
}