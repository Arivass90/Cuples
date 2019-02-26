package com.example.alexr.couples;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class InicioFragment extends Fragment {


    public InicioFragment(){

    }
ImageView img;
ImageView img1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);
        img= rootView.findViewById(R.id.Iniciofondo);
        Glide.with(this)
                .load(R.drawable.wallpaper)

                .into(img);

        img1= rootView.findViewById(R.id.imgcangrejo);
        Glide.with(this)
                .load(R.drawable.imgcangrejo)

                .into(img1);

        return rootView;
    }

}
