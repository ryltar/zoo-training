package com.fges.rizomm.m1.zoo.animals;

public class Tiger extends Vertebrate {
    @Override
    public String toString() {
        return "Tiger : " + super.toString();
    }

    @Override
    public String scream() {
        return "ROAAAAAAHH";
    }
}
