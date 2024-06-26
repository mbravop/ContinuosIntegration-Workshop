package com.team4;

import java.util.ArrayList;
import java.util.List;

public class Membership {
    
    public Cost totalCost;
    public MembershipType plan;
    public List<Feature> features= new ArrayList<>();

    public Membership(Cost totalCost, MembershipType plan, List<Feature>features){
        this.totalCost=totalCost;
        this.plan=plan;
        this.features=features;

    }
    
    public void printMembershipDetails(){

        System.out.println(plan.toString());
        System.out.println("Selected Features");
        for (Feature feature : features) {
            System.out.println(feature);
        }
        System.out.println("Your total cost will be "+totalCost.price);


    }


}
