package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;

public abstract class Visitor extends Person {

    public<T extends Animal> void caress(T animal){
        animal.caress();
    }

    public<T extends Animal> String voirAnimal(T animal){
        return "qu'il est beau le "+animal.getClass().getSimpleName();
    }

}
