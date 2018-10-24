package com.fges.rizomm.m1.zoo.animals;

public class Zebra extends Vertebrate {
    @Override
    public String toString() {
        return "Zebra : " + super.toString();
    }

    @Override
    public String scream() {
        return "Huhuhuhu";
    }
}
