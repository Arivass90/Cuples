package com.example.alexr.couples.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.alexr.couples.R;
import com.example.alexr.couples.model.Evento;
import com.example.alexr.couples.view.adapter.EventsAdapter;

import java.util.ArrayList;

public class GaleriaMainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private EventsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_main);

        recyclerview = findViewById(R.id.recycler);

        recyclerview.setLayoutManager(new GridLayoutManager(this,2));

        adapter = new EventsAdapter(this, getItemList());
        recyclerview.setAdapter(adapter);

    }

    private ArrayList<Evento> getItemList(){

        ArrayList<Evento> listItems = new ArrayList<>();

        listItems.add(new Evento(R.drawable.party, "Fiesta Viernes 15", "Fiesta donde acudieron 44 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta Sabado 16", "Fiesta donde acudieron 56 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta Jueves 4", "Fiesta donde acudieron 38 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta Martes 12", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta viernes 7", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta Domingo 21", "Fiesta donde acudieron 32 personas con una tematica ochentera"));
        listItems.add(new Evento(R.drawable.party, "Fiesta Lunes 8", "Fiesta donde acudieron 45 personas con una tematica ochentera"));

        return listItems;
    }

}
