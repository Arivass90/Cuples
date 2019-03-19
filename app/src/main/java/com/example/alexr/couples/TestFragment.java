package com.example.alexr.couples;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.service.voice.VoiceInteractionService;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class TestFragment extends Fragment {

    ImageView imgcorazon;
    ImageView img;

        public TestFragment(){

        }

         @Override
         public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
             View rootView=inflater.inflate(R.layout.fragment_test, container, false);
             Button entry = rootView.findViewById(R.id.id_test);

             img= rootView.findViewById(R.id.Testfondo);
             Glide.with(this)
                     .load(R.drawable.wallpaper)
                     .into(img);

             imgcorazon= rootView.findViewById(R.id.imgcorazonflecha);
             Glide.with(this)
                     .load(R.drawable.imgcorazonflecha)
                     .into(imgcorazon);

             entry.setOnClickListener(new View.OnClickListener() {

                 @Override
                 public void onClick(View v) {
                     Uri uri = Uri.parse("https://docs.google.com/forms/d/1q-aecOmSGrJi35BUssta7sBnHWK32sRWFLM2hm-bmCc/viewform?edit_requested=true");
                     Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                     startActivity(intent);
                 }

             });
        return rootView;

    }
}