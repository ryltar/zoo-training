package com.fges.rizomm.m1.zoo.animals;

public class Fish extends Vertebrate {
    @Override
    public String toString() {
        return "Fish : " + super.toString();
    }

    @Override
    public String scream() {
        return "bloup bloup";
    }
}
