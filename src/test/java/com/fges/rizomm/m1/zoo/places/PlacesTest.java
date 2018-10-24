package com.fges.rizomm.m1.zoo.places;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Cat;
import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.animals.Fish;
import com.fges.rizomm.m1.zoo.places.impl.Cage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlacesTest {
    @Test
    void when_createCage(){
        Cage cage = new Cage();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        cage.setAnimals(animals);
        Assertions.assertEquals(2, cage.getAnimals().size());
    }

    @Test
    void when_moveAllAnimals(){
        Cage cageDroite = new Cage();
        Cage cageGauche = new Cage();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        cageDroite.setAnimals(animals);
        Assertions.assertEquals(2, cageDroite.getAnimals().size());
        cageDroite.moveAnimals(cageGauche);
        Assertions.assertEquals(0, cageDroite.getAnimals().size());
        Assertions.assertEquals(2, cageGauche.getAnimals().size());
    }

    @Test
    void when_dirtyCageThenClean(){
        Cage cageDroite = new Cage();
        cageDroite.setDirtyPoint(100);
        Assertions.assertEquals(100, cageDroite.getDirtyPoint());
        cageDroite.clean();
        Assertions.assertEquals(0, cageDroite.getDirtyPoint());
    }

    @Test
    void when_testNotEmptyCage(){
        Cage cageDroite = new Cage();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        cageDroite.setAnimals(animals);
        Assertions.assertEquals(false, cageDroite.isEmpty());
    }

    @Test
    void when_addOneAnimalCage(){
        Cage cageDroite = new Cage();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        cageDroite.setAnimals(animals);
        Assertions.assertEquals(2, cageDroite.getAnimals().size());
        cageDroite.addAnimal(new Fish());
        Assertions.assertEquals(3, cageDroite.getAnimals().size());
    }



}
