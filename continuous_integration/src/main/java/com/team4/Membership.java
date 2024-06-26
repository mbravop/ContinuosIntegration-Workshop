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

    public Membership CustomizeFeatures(AdditionalFeatures af){
        Membership temp = new Membership(costo, beneficios,numeroDeMiembros);
        temp.costo = this.costo;
        temp.beneficios = this.beneficios;
        temp.numeroDeMiembros = this.numeroDeMiembros;
        temp.costo += af.costo;
        temp.beneficios.add(af.descripcion);
        return temp;
    }

    public Membership Discount(){
        Membership temp = this;
        if(temp.numeroDeMiembros>=2){
            temp.costo -= temp.costo*0.1;
        }
        return temp;
    }

    public void setNumberOfMembers(int numero){
        this.numeroDeMiembros = numero;
    }
}