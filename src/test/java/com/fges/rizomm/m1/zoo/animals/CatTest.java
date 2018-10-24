package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CatTest {

    @Test
    void scream() {
        Animal cat = new Cat();
        Assertions.assertEquals("Miaou",cat.scream());
        Assertions.assertEquals("Vertebrate", cat.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal cat = new Cat();
        cat.setName("toto");
        Assertions.assertEquals("Cat : toto",cat.toString());
    }
}