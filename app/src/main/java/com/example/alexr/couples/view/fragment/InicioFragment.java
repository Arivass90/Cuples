package com.example.alexr.couples.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.example.alexr.couples.view.activity.EventosActivity;
import com.example.alexr.couples.view.activity.ListaEventosActivity;

public class InicioFragment extends Fragment {

    ImageView img1,img2,img3,img4,img5,img6;
    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6 ;

    public InicioFragment(){

    }

    ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);

        {
            img = rootView.findViewById(R.id.Logo);
            Glide.with(this)
                    .load(R.drawable.logocuples_png)
                    .into(img);
        }

        btn1= rootView.findViewById(R.id.iB1);
        btn2= rootView.findViewById(R.id.iB2);
        btn3=rootView.findViewById(R.id.iB3);
        btn4= rootView.findViewById(R.id.iB4);
        btn5= rootView.findViewById(R.id.iB5);
        btn6=rootView.findViewById(R.id.iB6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData2();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData2();
            }
        });

        return rootView;
    }

    private void sendData()
    {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                EventosActivity.class);

        getActivity().startActivity(i);
    }
    private void sendData2()
    {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                ListaEventosActivity.class);

        getActivity().startActivity(i);
    }

}
