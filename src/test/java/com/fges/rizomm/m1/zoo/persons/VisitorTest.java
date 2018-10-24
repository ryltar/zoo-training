package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.places.impl.Places;
import com.fges.rizomm.m1.zoo.places.impl.PlacesOfVisits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void caress(){
        Animal dog = new Dog();
        Places placesOfVisits = new PlacesOfVisits();
        placesOfVisits.addAnimal(dog);
        Visitor child = new Child();
        for (Animal animal: placesOfVisits.getAnimals()){
            child.caress(animal);
            Assertions.assertEquals(1,animal.getStatisfactionCount());
        }
    }

    @Test
    void visit(){
        Visitor child = new Child();
        Animal dog = new Dog();
        Assertions.assertEquals("qu'il est beau le Dog", child.voirAnimal(dog));
    }

}
