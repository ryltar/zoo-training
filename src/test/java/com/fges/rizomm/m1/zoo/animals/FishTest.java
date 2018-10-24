package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FishTest {

    @Test
    void scream() {
        Animal fish = new Fish();
        Assertions.assertEquals("bloup bloup",fish.scream());
        Assertions.assertEquals("Vertebrate", fish.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal fish = new Fish();
        fish.setName("toto");
        Assertions.assertEquals("Fish : toto",fish.toString());
    }
}