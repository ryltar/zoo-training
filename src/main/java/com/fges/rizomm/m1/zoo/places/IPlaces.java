package com.fges.rizomm.m1.zoo.places;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.places.impl.Places;
import java.util.List;

public interface IPlaces {
    List<Animal> getAnimals();
    void setAnimals(List<Animal> animals);
    void addAnimal(Animal animal);
    boolean isEmpty();
    <T extends Places> void moveAnimals(T moveToPlace);
    int getDirtyPoint();
    void setDirtyPoint(int dirtyPoint);
    void clean();
}
