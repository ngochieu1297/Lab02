package com.example.admin.lab02;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Main5Activity extends AppCompatActivity {
    Button btnShowDate, btnShowTime;
    TextView txtShow;
    final Calendar c = Calendar.getInstance();
    int mMonth = c.get(Calendar.MONTH);
    int mYear = c.get(Calendar.YEAR);
    int mDay = c.get(Calendar.DAY_OF_MONTH);
    int mHour = c.get(Calendar.HOUR);
    int mMinute = c.get(Calendar.MINUTE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btnShowDate = findViewById(R.id.btnShowDate);
        btnShowTime = findViewById(R.id.btnShowTime);
        txtShow = findViewById(R.id.txtShow);

        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTimePickerDialog(view);
            }
        });

        btnShowDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog(view);
            }
        });
    }

    public void showDatePickerDialog(View view) {
        DatePickerDialog dpd = new DatePickerDialog(Main5Activity.this, new DatePickerDialog.OnDateSetListener() {
            @Override public void onDateSet(DatePicker v, int y, int m, int d) {
                txtShow.setText(d + "-" + (m + 1) + "-" + y);
            }
        }, mYear, mMonth, mDay);
        dpd.show();
    }

    public void showTimePickerDialog(View view) {
        TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1)
                    {
                        txtShow.setText("Time is "+ i +":" + i1);
                    }
                }, mHour, mMinute,true);
            tpd.show();
        }
}
