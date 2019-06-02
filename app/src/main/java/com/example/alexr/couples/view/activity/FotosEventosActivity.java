package com.example.alexr.couples.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.alexr.couples.R;
import com.example.alexr.couples.model.FotosEventosGrid;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FotosEventosActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private FakeFotosEventosAdapter adapter;
    DatabaseReference myRef;
    StaggeredGridLayoutManager staggeredGridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos);

        myRef = FirebaseDatabase.getInstance().getReference();


        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<FotosEventosGrid>()
                .setQuery(myRef.child("messages").limitToFirst(100), FotosEventosGrid.class)
                .setLifecycleOwner(FotosEventosActivity.this)
                .build();

        RecyclerView recycler = findViewById(R.id.recyclerFotosEventos);
        recycler.setLayoutManager(new GridLayoutManager(FotosEventosActivity.this, 2));
        recycler.setAdapter(new FotosEventosAdapter(options));
    }


    class FotosEventosAdapter extends FirebaseRecyclerAdapter<FotosEventosGrid, FotosEventosAdapter.FotoEventoHolder> {
        public FotosEventosAdapter(@NonNull FirebaseRecyclerOptions<FotosEventosGrid> options) {
            super(options);
        }

        @Override
        protected void onBindViewHolder(@NonNull FotoEventoHolder holder, int position, @NonNull FotosEventosGrid model) {
            Log.e("foto", model.original);
            Glide.with(holder.itemView.getContext()).load(model.original).into(holder.ivFotoEvento);
        }

        @NonNull
        @Override
        public FotoEventoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View contentView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_fotoseventos, null);
            return new FotosEventosAdapter.FotoEventoHolder(contentView);


        }


        class FotoEventoHolder extends RecyclerView.ViewHolder {
            ImageView ivFotoEvento;

            public FotoEventoHolder(@NonNull View itemView) {
                super(itemView);

                ivFotoEvento = itemView.findViewById(R.id.ivFotoevento);
            }
        }
    }


    private ArrayList<FotosEventosGrid> getItemList() {

        ArrayList<FotosEventosGrid> listItems = new ArrayList<>();

       /*listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));
        listItems.add(new FotosEventosGrid(R.drawable.party, "Fiesta Viernes 15"));




        */
        return listItems;
    }

    class FakeFotosEventosAdapter extends RecyclerView.Adapter {

        private Context context;
        private ArrayList<FotosEventosGrid> ListItemsFotosEventos;


        public FakeFotosEventosAdapter(Context context, ArrayList<FotosEventosGrid> listItemsFotosEventos) {
            this.context = context;
            ListItemsFotosEventos = listItemsFotosEventos;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View contentView = LayoutInflater.from(context).inflate(R.layout.viewholder_fotoseventos, null);
            return new Holder(contentView);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

            FotosEventosGrid foto = ListItemsFotosEventos.get(position);
            Holder Holder2 = (FakeFotosEventosAdapter.Holder) viewHolder;
            // Holder2.ivFotoEvento.setImageResource(foto.getFotoEvento());
            //  Holder2.tvTituloEvento.setText(foto.getTituloEvento())
            // Holder.tvDescripcion.setText(item.getDescripcion());
        }

        @Override
        public int getItemCount() {
            return ListItemsFotosEventos.size();
        }

        public class Holder extends RecyclerView.ViewHolder {
            ImageView ivFotoEvento;
            // TextView tvTituloEvento;
            // TextView tvDescripcion;

            public Holder(@NonNull View itemView) {
                super(itemView);

                ivFotoEvento = itemView.findViewById(R.id.ivFotoevento);
                // tvTituloEvento = itemView.findViewById(R.id.tvTituloFotoevento);
                // tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            }
        }
    }


}
