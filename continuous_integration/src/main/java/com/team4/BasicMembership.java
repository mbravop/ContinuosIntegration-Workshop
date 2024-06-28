package com.team4;

public class BasicMembership extends Membership{
    
    public BasicMembership(int costo, int numeroDeMiembros) {
        super(costo,numeroDeMiembros);
        this.beneficios.add("Acceso a ?reas comunes");
        this.beneficios.add("Descuentos en eventos");
        this.tipo="Basic";
    }



}