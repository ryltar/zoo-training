package com.fges.rizomm.m1.zoo.places;

import com.fges.rizomm.m1.zoo.persons.Visitor;

import java.util.List;

public interface IPlacesOfVisits {

    public int getMaxVisitors();
    public void setVisitors(List<Visitor> visitors);
    public <T extends Visitor> void enter(T visitor);
    public List<Visitor> getVisitors();
}
