package com.example.alexr.couples.model;

public class Evento {

    private int foto;
    private  String titulo;
    private  String descripcion;

    public Evento(int foto, String titulo, String descripcion){
        this.foto = foto;
        this.titulo= titulo;
        this.descripcion=descripcion;
    }

    public int getFoto(){
        return foto;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
