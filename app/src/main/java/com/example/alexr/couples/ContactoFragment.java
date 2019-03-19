package com.example.alexr.couples;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ContactoFragment extends Fragment {

    ImageView img;
    ImageView contacto;
    ImageView mapa;

    public ContactoFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contacto, container, false);

        img= rootView.findViewById(R.id.Contactofondo);
        Glide.with(this)
                .load(R.drawable.wallpaper)
                .into(img);

        contacto= rootView.findViewById(R.id.imagencontacto);
        Glide.with(this)
        .load(R.drawable.imagencontacto)
        .into(contacto);

        mapa= rootView.findViewById(R.id.mapacontacto);
        Glide.with(this)
                .load(R.drawable.mapacontacto)
                .into(mapa);

        return rootView;


    }
}