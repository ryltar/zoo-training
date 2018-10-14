package com.fges.rizomm.m1.zoo.animals;

public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }

    @Override
    public String scream() {
        return "Woof";
    }

}
