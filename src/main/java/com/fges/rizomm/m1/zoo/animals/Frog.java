package com.fges.rizomm.m1.zoo.animals;

public class Frog extends Vertebrate {
    @Override
    public String toString() {
        return "Frog : " + super.toString();
    }

    @Override
    public String scream() {
        return "Croa";
    }
}
