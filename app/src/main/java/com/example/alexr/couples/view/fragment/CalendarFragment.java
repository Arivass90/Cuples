package com.example.alexr.couples.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.example.alexr.couples.view.activity.CalendarFinalActivity;


public class CalendarFragment extends Fragment {

    Button BtnCalendar;
    ImageView img;
    ImageView img1;

    public CalendarFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);

        img= rootView.findViewById(R.id.Calendariofondo);
        Glide.with(this)
        .load(R.drawable.wallpaper)
        .into(img);

        img1= rootView.findViewById(R.id.imgcalendariocorazon);
        Glide.with(this)
        .load(R.drawable.imgcalendariocorazon)
        .into(img1);

        BtnCalendar = rootView.findViewById(R.id.id_calendario);

        BtnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        return rootView;

    }

    private void sendData() {
        Intent i = new Intent(getActivity().getBaseContext(),
                CalendarFinalActivity.class);

        getActivity().startActivity(i);
    }
}