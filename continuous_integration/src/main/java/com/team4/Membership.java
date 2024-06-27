package com.team4;

import java.util.ArrayList;

public class Membership{
    public int costo;
    public ArrayList<String> beneficios;
    public int numeroDeMiembros; 

    public Membership(int costo, ArrayList<String> beneficios, int numeroDeMiembros){
        this.costo = costo;
        this.beneficios = beneficios;
        this.numeroDeMiembros = numeroDeMiembros;
    }

    public int CustomizeFeatures(AdditionalFeatures af){
        int cost = this.costo += af.costo;
        //this.beneficios.add(af.descripcion);
        return cost;
    }

    public double Discount(int valor){
        double cost=valor - (valor*0.1);
        return cost;
    }

    public int costForMember(int numero){
        int result = numero*this.costo;
        return result;
    }


}