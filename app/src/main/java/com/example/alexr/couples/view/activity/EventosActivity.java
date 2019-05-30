package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EventosActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioButton rdSi;
    RadioButton rdNo;
    String respuestaRadio ;
    RadioGroup radioGroupE;
    RadioButton radioOptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        rdSi = findViewById(R.id.radioSi);
        rdNo = findViewById(R.id.radioNo);
        radioGroupE = findViewById(R.id.radioGroupEventos);



        findViewById(R.id.BtnRegistrofinal).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent = new Intent(EventosActivity.this, MenuActivity.class);
                Toast toast = Toast.makeText(EventosActivity.this, "Gracias!!", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();


                startActivity(intent);
                 ;
            }
        });
        radioGroupE.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioOptions = radioGroupE.findViewById(checkedId);

                switch (checkedId) {

                    case R.id.radioSi:

                        Toast toast = Toast.makeText(EventosActivity.this, "Has sido apuntado al nuevo evento!", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast.show();
                        break;
                    case R.id.radioNo:

                        Toast toast1 = Toast.makeText(EventosActivity.this, "Otra vez sera!!!!", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast1.show();
                        break;

                    default:
                }
            }
        });




    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

         /* if(rdNo.isChecked()){
          respuestaRd.setText(respuestaRadioMujer);

        }else if (rdSi.isChecked()){
          respuestaRd.setText(respuestaRadioHombre);
        }
        else{
            Toast toast1 = Toast.makeText(RegisterActivity.this, "Debes selecciona un sexo!!", Toast.LENGTH_LONG);
            toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            toast1.show();
        }*/


    }





    }











