package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OwlTest {

    @Test
    void scream() {
        Animal owl = new Owl();
        Assertions.assertEquals("Hou-hou",owl.scream());
        Assertions.assertEquals("Vertebrate", owl.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal owl = new Owl();
        owl.setName("toto");
        Assertions.assertEquals("Owl : toto",owl.toString());
    }
}