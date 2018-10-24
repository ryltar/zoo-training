package com.fges.rizomm.m1.zoo.animals;

public class Owl extends Vertebrate {
    @Override
    public String toString() {
        return "Owl : " + super.toString();
    }

    @Override
    public String scream() {
        return "Hou-hou";
    }
}
