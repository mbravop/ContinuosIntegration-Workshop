package com.team4;

import java.util.ArrayList;

public class Membership{
    private int costo;
    private ArrayList<String> beneficios;

    public Membership(int costo, ArrayList<String> beneficios){
        this.costo = costo;
        this.beneficios = beneficios;
    }

    public Membership CustomizeFeatures(AdditionalFeatures af){
        Membership temp = new Membership(costo, beneficios);
        temp.costo = this.costo;
        temp.beneficios = this.beneficios;
        temp.costo += af.costo;
        temp.beneficios.add(af.descripcion);
        return temp;
    }
}