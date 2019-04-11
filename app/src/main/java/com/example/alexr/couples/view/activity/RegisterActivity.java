package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.alexr.couples.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.BtnRegistrofinal).setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View w) {
        Toast toast = Toast.makeText(RegisterActivity.this, "Registro realizado con exito.\nBienvenido a Cuples!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
        Intent intent = new Intent(RegisterActivity.this,MenuActivity.class);
        startActivity(intent); }
        }
        );
        findViewById(R.id.Logo).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent); }
        }
        );

    }
    }
