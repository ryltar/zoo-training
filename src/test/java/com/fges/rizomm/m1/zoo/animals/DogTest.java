package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DogTest {

    @Test
    void scream() {
        Animal dog = new Dog();
        Assertions.assertEquals("Woof",dog.scream());
        Assertions.assertEquals("Vertebrate", dog.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal dog = new Dog();
        dog.setName("toto");
        Assertions.assertEquals("Dog : toto",dog.toString());
    }
}