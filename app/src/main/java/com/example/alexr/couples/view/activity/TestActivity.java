package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexr.couples.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TestActivity extends AppCompatActivity {
    Button aceptarTest;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
    DatabaseReference mReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);
        mReference = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference mensajeRef = mReference.child("testCompatibilidad");
        tx1=findViewById(R.id.res1);
        tx2=findViewById(R.id.res2);
        tx3=findViewById(R.id.res3);
        tx4=findViewById(R.id.res4);
        tx5=findViewById(R.id.res5);
        tx6=findViewById(R.id.res6);
        tx7=findViewById(R.id.res7);
        tx8=findViewById(R.id.res8);
        tx9=findViewById(R.id.res9);
        tx10=findViewById(R.id.res10);


        findViewById(R.id.BtnTestfinal).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent = new Intent(TestActivity.this, MenuActivity.class);
                Toast toast = Toast.makeText(TestActivity.this, "Tu test ha sido enviado con éxito!!! muchas gracias", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                String respuesta1 = tx1.getText().toString();
                mensajeRef.child("respuesta1").setValue(respuesta1);
                startActivity(intent);
                String respuesta2 = tx2.getText().toString();
                mensajeRef.child("respuesta2").setValue(respuesta2);
                startActivity(intent);
                String respuesta3 = tx3.getText().toString();
                mensajeRef.child("respuesta3").setValue(respuesta3);
                startActivity(intent);
                String respuesta4 = tx4.getText().toString();
                mensajeRef.child("respuesta4").setValue(respuesta4);
                startActivity(intent);
                String respuesta5 = tx5.getText().toString();
                mensajeRef.child("respuesta5").setValue(respuesta5);
                startActivity(intent);
                String respuesta6 = tx6.getText().toString();
                mensajeRef.child("respuesta6").setValue(respuesta6);
                startActivity(intent);
                String respuesta7 = tx7.getText().toString();
                mensajeRef.child("respuesta7").setValue(respuesta7);
                startActivity(intent);
                String respuesta8 = tx8.getText().toString();
                mensajeRef.child("respuesta8").setValue(respuesta8);
                startActivity(intent);
                String respuesta9 = tx9.getText().toString();
                mensajeRef.child("respuesta9").setValue(respuesta9);
                startActivity(intent);
                String respuesta10 = tx10.getText().toString();
                mensajeRef.child("respuesta10").setValue(respuesta10);
                startActivity(intent);
            }
        });
    }
}