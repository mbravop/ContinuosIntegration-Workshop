package com.team4;

public class FamilyMembership extends Membership{
    
    public FamilyMembership(int costo, int numeroDeMiembros) {
        super(costo, numeroDeMiembros);
        this.beneficios.add("Asistencia personalizada");
        this.beneficios.add("Acceso gratuito para familiares adicionales");
        this.tipo="Family";
    }


}