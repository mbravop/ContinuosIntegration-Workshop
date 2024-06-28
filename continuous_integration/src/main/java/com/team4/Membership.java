package com.team4;

import java.util.ArrayList;

public class Membership{
    public int costo;
    public ArrayList<String> beneficios = new ArrayList<>();
    public int numeroDeMiembros; 
    public ArrayList<AdditionalFeatures> additionalFeatures = new ArrayList<>();
    public String tipo;
    public int descuento=0;

    public Membership(int costo, int numeroDeMiembros){
        this.costo = costo;
        this.numeroDeMiembros = numeroDeMiembros;
    }

    public int CustomizeFeatures(AdditionalFeatures af){
        int cost = this.costo += af.costo;
        //this.beneficios.add(af.descripcion);
        return cost;
    }

    public double Discount(int valor){
        descuento+=valor*0.1;
        double cost=valor - (valor*0.1);
        
        return cost;
    }

    public int costForMember(int numero){
        int result = numero*this.costo;
        return result;
    }

    public double Charge(int valor){
        double cost=valor + (valor*0.15);
        return cost;
    }

}