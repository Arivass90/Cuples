package com.example.alexr.couples.view.fragment;

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
import com.example.alexr.couples.R;
import com.example.alexr.couples.view.activity.CalendarFinalActivity;
import com.example.alexr.couples.view.activity.TestActivity;

public class TestFragment extends Fragment {

    Button BtnTest;
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


        BtnTest = rootView.findViewById(R.id.id_test);

        BtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });


        return rootView;

    }

    private void sendData() {
        Intent i = new Intent(getActivity().getBaseContext(),
                TestActivity.class);

        getActivity().startActivity(i);
    }
}