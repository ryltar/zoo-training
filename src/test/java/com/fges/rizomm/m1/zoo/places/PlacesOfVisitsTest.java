package com.fges.rizomm.m1.zoo.places;

import com.fges.rizomm.m1.zoo.persons.Child;
import com.fges.rizomm.m1.zoo.persons.Visitor;
import com.fges.rizomm.m1.zoo.places.impl.PlacesOfVisits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlacesOfVisitsTest {

    @Test
     void when_enter(){
        PlacesOfVisits pov = new PlacesOfVisits();
        Visitor visitor = new Child();
        pov.enter(visitor);
        Assertions.assertEquals(1, pov.getVisitors().size());
    }

    @Test
    void when_returnMaxVisitors(){
        PlacesOfVisits pov = new PlacesOfVisits();
        Assertions.assertEquals(100,pov.getMaxVisitors());
    }

    @Test
    void when_setVisitors(){
        PlacesOfVisits pov = new PlacesOfVisits();
        List<Visitor> children = new ArrayList<>();
        children.add(new Child());
        children.add(new Child());
        pov.setVisitors(children);
        Assertions.assertEquals(2, pov.getVisitors().size());
    }

}
