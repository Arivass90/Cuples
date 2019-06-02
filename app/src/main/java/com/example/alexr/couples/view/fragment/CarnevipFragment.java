package com.example.alexr.couples.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.example.alexr.couples.model.CarneVipUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class CarnevipFragment extends Fragment {

    ImageView img;
    DatabaseReference mReference;
    TextView nombreUser;
    TextView edadUser;
    TextView sexoUser;

    public CarnevipFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_carnevip, container, false);
        img = rootView.findViewById(R.id.Carnefondo);
        Glide.with(this)
                .load(R.drawable.wallpaper)
                .into(img);
        nombreUser = rootView.findViewById(R.id.nombreUser);
        edadUser = rootView.findViewById(R.id.edadUser);
        sexoUser = rootView.findViewById(R.id.sexoUser);

        //idKey = getIntents().getStringExtra("idKey");


        mReference = FirebaseDatabase.getInstance().getReference().child("datacarne");
        mReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                CarneVipUser carneVipUser = dataSnapshot.getValue(CarneVipUser.class);

                nombreUser.setText("Nombre : " + carneVipUser.nombre);
                edadUser.setText("Edad : " + carneVipUser.edad);
                sexoUser.setText("Sexo : " + carneVipUser.sexo);


                //nombreUser.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName());
                //edadUser.setText(FirebaseAuth.getInstance().getCurrentUser().getEda);


               /* String name = dataSnapshot.child("nombre").getValue().toString();
                nombreUser.setText(name);
               // int age = Integer.parseInt(dataSnapshot.child("edad").getValue().toString());
                //edadUser.setText(age);
                String sex = dataSnapshot.child("sexo").getValue().toString();
                sexoUser.setText(sex);*/


                /*CarneVipUser carneVipUser = dataSnapshot.getValue(CarneVipUser.class);
                //String name = carneVipUser.getNombre();
                nombreUser.setText(carneVipUser.nombre);
               // int age = carneVipUser.getEdad();
                edadUser.setText(carneVipUser.edad);
               // String sex = carneVipUser.getSexo();
                sexoUser.setText(carneVipUser.sexo);*/

               /* String mynombre = dataSnapshot.getValue(String.class);
                nombreUser.setText(mynombre);
                String myedad = dataSnapshot.getValue(String.class);
                edadUser.setText(myedad);
                String mysexo = dataSnapshot.getValue(String.class);
                sexoUser.setText(mysexo);*/


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });

       /* private void dispatchTakePictureIntent(){

            Uri fileUri = null;
            try {
                fileUri = MediaFiles.createFile(this, MediaFiles.Type.IMAGE).uri;
            } catch (IOException ex) {
                // No se pudo crear el fichero
            }

            if (fileUri != null) {
                mFileUri = fileUri;

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                startActivityForResult(intent, RC_IMAGE_TAKE);
            }
        }*/

        return rootView;


    }


}