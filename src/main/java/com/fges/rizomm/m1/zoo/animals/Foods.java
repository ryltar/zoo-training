package com.fges.rizomm.m1.zoo.animals;

import java.util.Arrays;
import java.util.List;

public enum Foods {
    CROQUETTE("Croquette", Arrays.asList(Dog.class, Cat.class));

    private final String name;
    private final List<Class> animals;

    Foods(String name, List<Class> animals){
        this.name = name;
        this.animals = animals;
    }

    public String getName(){
        return this.name;
    }

    public List<Class> getAnimalsClass(){
        return this.animals;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public <T extends Animal> boolean canEat(T animal){
        return this.getAnimalsClass().contains(animal.getClass());
    }
}
