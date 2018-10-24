package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TigerTest {

    @Test
    void scream() {
        Animal tiger = new Tiger();
        Assertions.assertEquals("ROAAAAAAHH",tiger.scream());
        Assertions.assertEquals("Vertebrate", tiger.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal tiger = new Tiger();
        tiger.setName("toto");
        Assertions.assertEquals("Tiger : toto",tiger.toString());
    }
}