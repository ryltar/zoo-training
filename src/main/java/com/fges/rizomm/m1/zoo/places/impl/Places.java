package com.fges.rizomm.m1.zoo.places.impl;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.places.IPlaces;
import java.util.ArrayList;
import java.util.List;

public abstract class Places implements IPlaces {

    private List<Animal> animals = new ArrayList<>();

    public int getDirtyPoint() {
        return dirtyPoint;
    }

    public void setDirtyPoint(int dirtyPoint) {
        this.dirtyPoint = dirtyPoint;
    }

    private int dirtyPoint = 50;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public boolean isEmpty() {
        return this.animals.isEmpty();
    }

    public <T extends Places> void moveAnimals(T moveToPlace){
        for(Animal animal: this.getAnimals()){
            moveToPlace.addAnimal(animal);
        }
        this.animals.clear();
    }

    public void clean(){
        this.dirtyPoint = 0;
    }
}
