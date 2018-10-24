package com.fges.rizomm.m1.zoo.animals;

public class Spider extends Invertebrate {

    @Override
    public String toString() {
        return "Spider : " + super.toString();
    }

    @Override
    public String scream() {
        return "Psss";
    }
}
