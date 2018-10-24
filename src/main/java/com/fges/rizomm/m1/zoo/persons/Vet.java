package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;

public class Vet<T extends Animal> extends Employee {

    public void cure(T animal) {
        animal.setHealth(100);
    }

    public String checkHealth(T animal) {
        int pdv = animal.getHealth();
        if(pdv < 60){
            return "l'animal n'est pas en très bonne santé";
        }else{
            return  "l'animal est en très bonne santé";
        }
    }

}
