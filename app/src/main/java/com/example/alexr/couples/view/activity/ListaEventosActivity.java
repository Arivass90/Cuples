package com.example.alexr.couples.view.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexr.couples.R;
import com.example.alexr.couples.model.Evento;

import java.util.ArrayList;

public class ListaEventosActivity extends AppCompatActivity {

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
        // Hay que poner un set on click listener para que nos muestre la lista de fotos del dia seleccionado



    }

    private ArrayList<Evento> getItemList(){

        ArrayList<Evento> listItems = new ArrayList<>();

        listItems.add(new Evento("1", R.drawable.party, "Fiesta Viernes 15", "Fiesta donde acudieron 44 personas con una tematica ochentera"));
        listItems.add(new Evento("2", R.drawable.party, "Fiesta Sabado 16", "Fiesta donde acudieron 56 personas con una tematica ochentera"));
        listItems.add(new Evento("3", R.drawable.party, "Fiesta Jueves 4", "Fiesta donde acudieron 38 personas con una tematica ochentera"));
        listItems.add(new Evento("4", R.drawable.party, "Fiesta Martes 12", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        listItems.add(new Evento("5", R.drawable.party, "Fiesta viernes 7", "Fiesta donde acudieron 42 personas con una tematica ochentera"));
        listItems.add(new Evento("6", R.drawable.party, "Fiesta Domingo 21", "Fiesta donde acudieron 32 personas con una tematica ochentera"));
        listItems.add(new Evento("7", R.drawable.party, "Fiesta Lunes 8", "Fiesta donde acudieron 45 personas con una tematica ochentera"));

        return listItems;
    }

    class EventsAdapter extends RecyclerView.Adapter {

        private Context context;
        private ArrayList<Evento> ListItems;

        EventsAdapter(Context context, ArrayList<Evento> listItems) {
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

            final Evento evento = ListItems.get(position);
            final Holder holder =(Holder) viewHolder;
            holder.ivFoto.setImageResource(evento.getFoto());
            holder.tvTitulo.setText(evento.getTitulo());
            holder.tvDescripcion.setText(evento.getDescripcion());

            holder.ivFoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(holder.itemView.getContext(), FotosEventosActivity.class);
                    intent.putExtra("EVENT_ID", evento.id);
                    holder.itemView.getContext().startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return ListItems.size();
        }

        class Holder extends RecyclerView.ViewHolder {
            ImageView ivFoto;
            TextView tvTitulo;
            TextView tvDescripcion;

            Holder(@NonNull View itemView) {
                super(itemView);

                ivFoto = itemView.findViewById(R.id.ivFoto);
                tvTitulo = itemView.findViewById(R.id.tvTitulo);
                tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            }
        }
    }
}



