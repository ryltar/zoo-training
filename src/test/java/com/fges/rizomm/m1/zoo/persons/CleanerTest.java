package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.places.impl.Cage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CleanerTest {

    @Test
    void when_notEmptyClean(){
        Cleaner<Cage> cleaner = new Cleaner<>();
        Cage cage = new Cage();
        cage.addAnimal(new Dog());
        Assertions.assertEquals("La cage n\'est pas vide, Impossible de la nettoyer !", cleaner.clean(cage));
    }

    @Test
    void when_emptyClean(){
        Cleaner<Cage> cleaner = new Cleaner<>();
        Cage cage = new Cage();
        Assertions.assertEquals("La cage a été nettoyé", cleaner.clean(cage));
    }

}
