package com.example.alexr.couples.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexr.couples.R;
import com.example.alexr.couples.model.Evento;

import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Evento> ListItems;

    public EventsAdapter(Context context, ArrayList<Evento> listItems) {
        this.context = context;
        ListItems = listItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View contentView = LayoutInflater.from(context).inflate(R.layout.activity_item_grid,null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

       Evento item = ListItems.get(position);
        Holder Holder =(Holder) viewHolder;
        Holder.ivFoto.setImageResource(item.getFoto());
        Holder.tvTitulo.setText(item.getTitulo());
        Holder.tvDescripcion.setText(item.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return ListItems.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvTitulo;
        TextView tvDescripcion;

        public Holder(@NonNull View itemView) {
            super(itemView);

            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }
}
