package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.example.alexr.couples.R;

public class SplashActivity extends AppCompatActivity {


    public AnimationDrawable animacion;
    public ImageView loading;
    public Animation transicion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        loading = findViewById(R.id.loading);
        loading.setBackgroundResource(R.drawable.cargando);
        animacion = (AnimationDrawable) loading.getBackground();
        animacion.start();
        transicion = AnimationUtils.loadAnimation(this, R.anim.mitransicion);
        loading.startAnimation(transicion);
        transicion.setAnimationListener(new Animation.AnimationListener() {

            public void siguienteActivity() {
                animacion.stop(); //Paramos el AnimationDrawable
                Intent intento = new Intent(SplashActivity.this, LoginActivity.class); // Lanzamos SiguienteActivity
                startActivity(intento);
                finish(); //Finalizamos este activity
            }


            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                siguienteActivity();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}