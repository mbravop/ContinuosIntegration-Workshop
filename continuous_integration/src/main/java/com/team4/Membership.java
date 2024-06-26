package com.team4;

import java.util.ArrayList;
import java.util.List;

public class Membership {
    
    public Cost price;
    public MembershipType plan;
    public List<Feature> features= new ArrayList<>();

    public Membership(Cost price, MembershipType plan, List<Feature>features){
        this.price=price;
        this.plan=plan;
        this.features=features;

    }
    
    public void printMembershipDetails(){

        


    }


}
