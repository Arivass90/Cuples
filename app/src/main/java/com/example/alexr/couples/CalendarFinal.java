package com.example.alexr.couples;
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

import java.util.Calendar;

public class CalendarFinal extends AppCompatActivity implements View.OnClickListener {


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
        btncalendario.setOnClickListener(CalendarFinal.this);
        volver = (Button) findViewById(R.id.volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(CalendarFinal.this, MenuActivity.class);
                startActivity(intent2);
            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.N)

    @Override
    public void onClick(View v) {



        if (v == btncalendario) {
            final Calendar c = Calendar.getInstance();
            day = c.get(Calendar.DAY_OF_MONTH);
            month = c.get(Calendar.MONTH);
            year = c.get(Calendar.YEAR);


            final DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    //datePickerDialog=null;

                    int mesActual = monthOfYear;
                    String diaFormateado = (dayOfMonth < 10)? "0" + String.valueOf(dayOfMonth):String.valueOf(dayOfMonth);
                    String mesFormateado = (mesActual < 10)? "0" + String.valueOf(mesActual):String.valueOf(mesActual);

                    fechafinal.setText(diaFormateado + "/" + mesFormateado +"/"+ year);
                }

            }
                    ,day, month, year);
            datePickerDialog.show();



        }
    }


}
