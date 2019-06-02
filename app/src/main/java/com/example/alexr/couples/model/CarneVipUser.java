package com.example.alexr.couples.model;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class CarneVipUser {
    public String uid;
    public String nombre;
    public int edad;
    public String sexo;
    public String mediaUrl;
    //public String mediaType;
    public Map<String, Boolean> likes = new HashMap<>();

    public CarneVipUser() {
    }


    public CarneVipUser(String uid, String nombre, int edad, String sexo, String mediaUrl) {
        this.uid = uid;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        //this.mediaUrl = mediaUrl;

    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("nombre", nombre);
        result.put("edad", edad);
        result.put("sexo", sexo);
        // result.put("mediaUrl", mediaUrl);

        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

