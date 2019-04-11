package com.example.alexr.couples.view.activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.alexr.couples.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarFinalActivity extends AppCompatActivity implements View.OnClickListener {

    Button volver;
    at.markushi.ui.CircleButton btncalendario;
    TextView fechafinal;

    private int day, month, year, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_final);


        fechafinal = findViewById(R.id.fechafinal);
        btncalendario = (at.markushi.ui.CircleButton) findViewById(R.id.id_fecha);
        btncalendario.setOnClickListener(CalendarFinalActivity.this);
        volver = (Button) findViewById(R.id.volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(CalendarFinalActivity.this, MenuActivity.class);
                startActivity(intent2);
            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.N)

    @Override
    public void onClick(View v) {

        if (v == btncalendario) {

            final DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year,
                                      int monthOfYear, int dayOfMonth) {
                    final Calendar myCalendar = Calendar.getInstance();

                    myCalendar.set(Calendar.YEAR, year);
                    myCalendar.set(Calendar.MONTH, monthOfYear);
                    myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    String myFormat = "yyyy-MM-dd"; //In which you need put here
                    SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                    //   expiry.setText(sdf.format(myCalendar.getTime()));

                }
            }, Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);

            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
            datePickerDialog.show();

        }
    }
}