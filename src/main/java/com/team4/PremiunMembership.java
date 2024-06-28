package com.team4;

public class PremiunMembership extends Membership{

    public PremiunMembership(int costo, int numeroDeMiembros) {
        super(costo, numeroDeMiembros);
        this.beneficios.add("Acceso ilimitado a todas las ?reas");
        this.beneficios.add("Descuentos exclusivos en servicios");
        this.tipo="Premium";
    }

}