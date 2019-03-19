package com.example.alexr.couples;

public class Item {

    private int Foto;
    private String titulo;

    public Item (int foto,String titulo){
        Foto = foto;
        this.titulo= titulo;
    }

    public int getFoto(){
        return Foto;
    }

    public String getTitulo(){
        return titulo;
    }
}

