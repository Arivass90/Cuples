package com.example.alexr.couples;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReciclerView extends AppCompatActivity {

    FloatingActionButton btonFloat;
    private RecyclerView reciclerview;
    private Adapter adapter;
    private  RecyclerView.LayoutManager manager;


    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.recicler_view);
        reciclerview= findViewById(R.id.id_recycleview);
        manager= new LinearLayoutManager(this);
        reciclerview.setLayoutManager(new GridLayoutManager(this,2));


        adapter = new Adapter(this, GetListItems());
        reciclerview.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                Intent intent = new Intent(ReciclerView.this, GaleriaFragment.class);
                startActivity(intent);

            }
        });


    }

    private ArrayList<Item> GetListItems(){

        ArrayList<Item> ListItems = new ArrayList<>();

        return ListItems;
    }


}
