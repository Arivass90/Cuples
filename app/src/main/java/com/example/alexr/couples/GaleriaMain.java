package com.example.alexr.couples;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class GaleriaMain extends AppCompatActivity {

    private RecyclerView recyclerview;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_main);

        recyclerview =(RecyclerView) findViewById(R.id.recycler);
        manager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(manager);

        adapter = new RecyclerViewAdapter(this,GetItemList());
        recyclerview.setAdapter(adapter);

    }
    private ArrayList<Item_grid> GetItemList(){

        ArrayList<Item_grid> ListItems = new ArrayList<>();

        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Viernes 15", "Fiesta donde acudieron 44 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Sabado 16", "Fiesta donde acudieron 56 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Jueves 4", "Fiesta donde acudieron 38 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Martes 12", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta viernes 7", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Domingo 21", "Fiesta donde acudieron 32 personas con una tematica ochentera"));
        ListItems.add(new Item_grid (R.drawable.party, "Fiesta Lunes 8", "Fiesta donde acudieron 45 personas con una tematica ochentera"));



        return ListItems;
    }

}
