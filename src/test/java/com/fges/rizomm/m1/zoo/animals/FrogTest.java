package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FrogTest {

    @Test
    void scream() {
        Animal frog = new Frog();
        Assertions.assertEquals("Croa",frog.scream());
        Assertions.assertEquals("Vertebrate", frog.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal frog = new Frog();
        frog.setName("toto");
        Assertions.assertEquals("Frog : toto",frog.toString());
    }
}