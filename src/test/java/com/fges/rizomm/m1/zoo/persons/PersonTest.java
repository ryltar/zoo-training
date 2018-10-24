package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.places.impl.Cage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void when_createPerson(){
        Person child = new Child();
        child.setAge(10);
        child.setNom("Martin");
        child.setPrenom("Guillaume");
        Assertions.assertEquals("Nom : Martin prenom : Guillaume age : 10", child.toString());
    }


}
