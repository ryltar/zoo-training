package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SpiderTest {

    @Test
    void scream() {
        Animal spider = new Spider();
        Assertions.assertEquals("Psss",spider.scream());
        Assertions.assertEquals("Invertebrate", spider.getClass().getSuperclass().getSimpleName());
    }

    @Test
    void when_toString(){
        Animal spider = new Spider();
        spider.setName("toto");
        Assertions.assertEquals("Spider : toto",spider.toString());
    }
}