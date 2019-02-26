package com.example.alexr.couples;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter implements View.OnClickListener {

    private Context context;
    private ArrayList<Item> Listitems;
    private View.OnClickListener Listener;

    public Adapter(Context context, ArrayList<Item> Listitems){

        this.context=context;
        this.Listitems=Listitems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View contentView = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        System.out.println("Create viewholder"+ viewGroup);
        contentView.setOnClickListener(this);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        Item item =Listitems.get(i);
        Holder Holder =(Holder) viewHolder;
        Holder.IvFoto.setImageResource(item.getFoto());
        Holder.Tvtitulo.setText(item.getTitulo());
        System.out.println("On view viewHolder"+ i);
    }

    @Override
    public int getItemCount() {
        return Listitems.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.Listener=listener;
    }

    @Override
    public void onClick(View v) {

        if(Listener!=null){
            Listener.onClick(v);
        }
    }

    public class Holder extends RecyclerView.ViewHolder{
        ImageView IvFoto;
        TextView Tvtitulo;;

        public Holder(@NonNull View itemView) {
            super(itemView);

            IvFoto = itemView.findViewById(R.id.foto_cardview);
            Tvtitulo = itemView.findViewById(R.id.titulo_cardview);
        }
    }
}

