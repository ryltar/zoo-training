package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void when_animal_scream_then_string() {
        Animal dog = new Dog();
        assertTrue(dog.scream().matches(".*"));
        assertTrue(dog.scream().equals("Woof"));
        assertTrue(!dog.scream().isEmpty());
    }

    @Test
    void when_animal_eat_then_count() {
        Animal dog = new Dog();
        dog.eat("croquette");
        assertEquals(1, dog.getEatCount());
    }

    @Test
    void when_animal_eat_then_last_meal(){
        Animal dog = new Dog();
        dog.eat("croquette");
        assertEquals("croquette", dog.getLastMeal());
    }

    @Test
    void when_setEatCount(){
        Animal dog = new Dog();
        dog.setEatCount(100);
        assertEquals(100, dog.getEatCount());
    }

    @Test
    void when_setStatisfactionCount(){
        Animal dog = new Dog();
        dog.setStatisfactionCount(100);
        assertEquals(100, dog.getStatisfactionCount());
    }

    @Test
    void when_setHealthPoint(){
        Animal dog = new Dog();
        dog.setHealth(100);
        assertEquals(100, dog.getHealth());
    }

    @Test
    void when_caress(){
        Animal dog = new Dog();
        dog.caress();
        assertEquals(1,dog.getStatisfactionCount());
    }
}