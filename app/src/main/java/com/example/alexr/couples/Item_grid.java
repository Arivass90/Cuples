package com.example.alexr.couples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Item_grid {


    private int Foto;
    private  String titulo;
    private  String descripcion;

    public Item_grid (int foto,String titulo,String descripcion){
        Foto = foto;
        this.titulo= titulo;
        this.descripcion=descripcion;

    }

    public int getFoto(){

        return Foto;
    }

    public String getTitulo(){

        return titulo;
    }

    public String getDescripcion(){


        return descripcion;
    }
}
