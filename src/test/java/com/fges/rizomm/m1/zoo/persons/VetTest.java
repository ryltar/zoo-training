package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.places.impl.Places;
import com.fges.rizomm.m1.zoo.places.impl.PlacesOfVisits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VetTest {

    @Test
    void when_cure(){
        Vet<Animal> vet = new Vet<>();
        Animal dog = new Dog();
        vet.cure(dog);
        Assertions.assertEquals("l'animal est en très bonne santé", vet.checkHealth(dog));
    }

    @Test
    void when_checkHealth(){
        Vet<Animal> vet = new Vet<>();
        Animal dog = new Dog();
        dog.setHealth(30);
        Assertions.assertEquals("l'animal n'est pas en très bonne santé", vet.checkHealth(dog));
    }

}
