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
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Arrays;

public class FirstActivity extends AppCompatActivity {

    ImageView img;
    private static final int RC_SIGN_IN = 123;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.BtnLoginGoogle).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        signIn();
        }
        });

        findViewById(R.id.BtnLogin).setOnClickListener( new View.OnClickListener() {
         @Override
         public void onClick(View w) {
          Toast toast = Toast.makeText(FirstActivity.this, "Login realizado con exito.\n" +
          "Bienvenido a Cuples!", Toast.LENGTH_LONG);
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
         startActivity(intent); }
         }
         );

        comeIn(); }

    void comeIn(){
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null) {
            startActivity(new Intent(this, HeaderGoogle.class));
            finish();
        }
    }

    void signIn(){
        startActivityForResult(
                AuthUI.getInstance()
                 .createSignInIntentBuilder()
                 .setAvailableProviders(Arrays.asList(
                 new AuthUI.IdpConfig.GoogleBuilder().build()))
                .build(),
                RC_SIGN_IN);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            if (resultCode == RESULT_OK) {
                comeIn(); }
        }}

        {
            img = findViewById(R.id.Logo);
            Glide.with(this)
            .load(R.drawable.logocuples_png)
            .into(img);
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }

