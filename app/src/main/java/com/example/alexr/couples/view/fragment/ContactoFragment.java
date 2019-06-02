package com.example.alexr.couples.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.example.alexr.couples.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactoFragment extends Fragment implements OnMapReadyCallback {

    ImageView img;
    ImageView contacto;

    public ContactoFragment() {
    }

    GoogleMap map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contacto, container, false);
        final EditText your_name = rootView.findViewById(R.id.your_name);
        final EditText your_email = rootView.findViewById(R.id.your_email);
        final EditText your_subject = rootView.findViewById(R.id.your_subject);
        final EditText your_message = rootView.findViewById(R.id.your_message);

        Button email = (Button) rootView.findViewById(R.id.post_message);
        email.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String name = your_name.getText().toString();
                String email = your_email.getText().toString();
                String subject = your_subject.getText().toString();
                String message = your_message.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    your_name.setError("Nombre incorrecto");
                    your_name.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    your_email.setError("Email incorrecto");
                    return;
                }

                if (TextUtils.isEmpty(subject)) {
                    your_subject.setError("Asunto incorrecto");
                    your_subject.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(message)) {
                    your_message.setError("Mensaje incorrecto");
                    your_message.requestFocus();
                    return;
                }

                Intent sendEmail = new Intent(android.content.Intent.ACTION_SEND);

                /* Fill it with Data */
                sendEmail.setType("plain/text");
                sendEmail.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"proyectolove2018@gmail.com"});
                sendEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
                sendEmail.putExtra(android.content.Intent.EXTRA_TEXT,
                        "name:" + name + '\n' + "Email ID:" + email + '\n' + "Message:" + '\n' + message);

                /* Send it off to the Activity-Chooser */
                startActivity(Intent.createChooser(sendEmail, "Enviando Email..."));
            }

        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        UiSettings uiSettings = map.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        LatLng pp = new LatLng(41.401473, 2.145112);
        map.addMarker(new MarkerOptions().position(pp).title("Cuple's Club"));

        float zoomlevel = 18;

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(pp, zoomlevel));
    }

}