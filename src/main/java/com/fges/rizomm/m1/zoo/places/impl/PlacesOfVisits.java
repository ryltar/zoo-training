package com.fges.rizomm.m1.zoo.places.impl;

import com.fges.rizomm.m1.zoo.persons.Visitor;
import com.fges.rizomm.m1.zoo.places.IPlacesOfVisits;

import java.util.ArrayList;
import java.util.List;

public class PlacesOfVisits extends Places implements IPlacesOfVisits {
    private final int maxVisitors = 100;
    private List<Visitor> visitors = new ArrayList<>();

    @Override
    public <T extends Visitor> void enter(T visitor){
        if(this.visitors.size() < this.maxVisitors){
            this.visitors.add(visitor);
        }else{
            System.out.println("trop de personne dans ce lieu");
        }
    }

    @Override
    public int getMaxVisitors() {
        return maxVisitors;
    }

    @Override
    public List<Visitor> getVisitors() {
        return visitors;
    }

    @Override
    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }
}
