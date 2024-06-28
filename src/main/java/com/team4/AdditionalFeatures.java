package com.team4;

public class AdditionalFeatures {
    public String descripcion;
    public int costo;

    public AdditionalFeatures(String descripcion, int costo){
        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "descripcion=" + descripcion + ", costo=" + costo;
    }

}