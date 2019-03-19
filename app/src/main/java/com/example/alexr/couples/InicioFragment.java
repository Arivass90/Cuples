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

    ImageView img1,img2,img3,img4,img5,img6;

    public InicioFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);
       // img1= rootView.findViewById(R.id.iB1);
        //Glide.with(this)
          //    .load(R.drawable.party)
            //   .into(img1);

        //img2= rootView.findViewById(R.id.iB2);
        //Glide.with(this)
          //      .load(R.drawable.party)
            //    .into(img2);

       // img3= rootView.findViewById(R.id.iB3);
        //Glide.with(this)
          //      .load(R.drawable.party)
            //    .into(img3);

        //img4= rootView.findViewById(R.id.iB4);
        //Glide.with(this)
          //      .load(R.drawable.party)
            //    .into(img4);

        //img5= rootView.findViewById(R.id.iB5);
        //Glide.with(this)
          //      .load(R.drawable.party)
            //    .into(img5);
        //img6= rootView.findViewById(R.id.iB6);
        //Glide.with(this)
          //      .load(R.drawable.party)
            //    .into(img6);


        return rootView;
    }

}
