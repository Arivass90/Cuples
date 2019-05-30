package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.example.alexr.couples.model.CarneVipUser;
import com.example.alexr.couples.view.fragment.CarnevipFragment;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioButton rdHombre;
    RadioButton rdMujer;
    DatabaseReference mReference;
    String respuestaRadio ;
    RadioGroup radioGroupG;
    RadioButton radioOptions;
    ImageButton mImageButton;
    static final int RC_IMAGE_PICK = 9000;
    Uri mediaUri;
    String mediaType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mReference = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference mensajeRef = mReference.child("datacarne");
        final TextView mensajeNombre = findViewById(R.id.datoNombre);
        final TextView mensajeEdad = findViewById(R.id.datoEdad);
        rdHombre = findViewById(R.id.radioHombre);
        rdMujer = findViewById(R.id.radioMujer);
        radioGroupG = findViewById(R.id.radioGroupGender);
        mImageButton = findViewById(R.id.FotoPerfil);


        findViewById(R.id.BtnRegistrofinal).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                Toast toast = Toast.makeText(RegisterActivity.this, "Tus datos han sido cargados en el carnet vip!", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                //CarneVipUser carneVipUser = new CarneVipUser()
                String nombre = mensajeNombre.getText().toString();
                mensajeRef.child("nombre").setValue(nombre);
                int edad = Integer.parseInt(mensajeEdad.getText().toString());
                mensajeRef.child("edad").setValue(edad);
                mensajeRef.child("sexo").setValue(respuestaRadio);

                startActivity(intent);
                 ;
            }
        });
        radioGroupG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioOptions = radioGroupG.findViewById(checkedId);

                switch (checkedId) {

                    case R.id.radioMujer:
                        respuestaRadio = radioOptions.getText().toString();
                        break;
                    case R.id.radioHombre:
                        respuestaRadio = radioOptions.getText().toString();
                        break;

                    default:
                }
            }
        });

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), RC_IMAGE_PICK);
            }
        });


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);


        if (data != null) {
            if (requestCode == RC_IMAGE_PICK) {
                mediaUri = data.getData();
                mediaType = "image";
                Glide.with(this).load(mediaUri);
            } else {
            }


        }}

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











