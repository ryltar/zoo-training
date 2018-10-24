package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ZebraTest {

    @Test
    void scream() {
        Animal zebra = new Zebra();
        Assertions.assertEquals("Huhuhuhu",zebra.scream());
        Assertions.assertEquals("Vertebrate", zebra.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal zebra = new Zebra();
        zebra.setName("toto");
        Assertions.assertEquals("Zebra : toto",zebra.toString());
    }
}