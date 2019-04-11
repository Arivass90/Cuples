package com.example.alexr.couples.model;

public class FotoEvento {

    private int foto;
    private String titulo;

    public FotoEvento(int foto, String titulo){
        this.foto = foto;
        this.titulo= titulo;
    }

    public int getFoto(){
        return foto;
    }

    public String getTitulo(){
        return titulo;
    }
}

