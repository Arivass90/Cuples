package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alexr.couples.R;

public class TestActivity extends AppCompatActivity {
    Button aceptarTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        findViewById(R.id.BtnTestfinal).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent = new Intent(TestActivity.this, MenuActivity.class);
                Toast toast = Toast.makeText(TestActivity.this, "Tu test ha sido enviado con éxito!!! muchas gracias", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                startActivity(intent);
            }
        });
    }
}