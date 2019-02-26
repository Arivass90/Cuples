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


public class CarnevipFragment extends Fragment {


    public CarnevipFragment(){

    }

    ImageView img;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_carnevip, container, false);
        img= rootView.findViewById(R.id.Carnefondo);
        Glide.with(this)
                .load(R.drawable.wallpaper)
                .into(img);

        return inflater.inflate(R.layout.fragment_carnevip, container, false);


    }
}