package com.example.alexr.couples.model;

public class Evento {

    public String id;
    private int foto;
    private  String titulo;
    private  String descripcion;

    public Evento(String id, int foto, String titulo, String descripcion) {
        this.id = id;
        this.foto = foto;
        this.titulo = titulo;
        this.descripcion = descripcion;
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
