package com.team4;

public class Feature {
    String description;
    Double cost;
    MembershipType plan;

    public Feature(String description, Double cost, MembershipType plan){

        this.description=description;
        this.cost=cost;
        this.plan=plan;
    }

}
