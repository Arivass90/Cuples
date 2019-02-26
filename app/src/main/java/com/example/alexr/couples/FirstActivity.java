package com.example.alexr.couples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.Glide;

public class FirstActivity extends AppCompatActivity {

    ImageView img;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        {
            img = findViewById(R.id.Logo);
            Glide.with(this)
            .load(R.drawable.logocuples_png)
            .into(img);
        }
            findViewById(R.id.BtnLogin).setOnClickListener( new View.OnClickListener() {

                        @Override

                        public void onClick(View w) {
                            Toast toast = Toast.makeText(FirstActivity.this, "Login realizado con exito.\nBienvenido a Cuples!", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                            toast.show();
                            Intent intent = new Intent(FirstActivity.this, MenuActivity.class);
                            startActivity(intent);
                            }
                            }
            );


            findViewById(R.id.BtnRegistro).setOnClickListener(
                    new View.OnClickListener() {

                        @Override
                        public void onClick(View w) {
                            Intent intent = new Intent(FirstActivity.this, RegisterActivity.class);
                            startActivity(intent);
                            }
                            }
            );
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }

