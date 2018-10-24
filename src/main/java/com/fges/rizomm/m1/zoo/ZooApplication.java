package com.fges.rizomm.m1.zoo;

import com.fges.rizomm.m1.zoo.animals.*;
import com.fges.rizomm.m1.zoo.persons.AnimalKeeper;
import com.fges.rizomm.m1.zoo.persons.Cleaner;
import com.fges.rizomm.m1.zoo.places.impl.Cage;

public class ZooApplication {

    private static final String ZOO_NAME = "PARIDAIZA";

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Welcome to " + ZOO_NAME);
        System.out.println("************************");

        Dog rex = new Dog();
        Dog gaia = new Dog();

        Cat felix = new Cat();
        felix.setName("Felix");

        rex.setName("Rex");
        gaia.setName("Gaia");


        Cage c1 = new Cage();

        c1.addAnimal(gaia);
        c1.addAnimal(felix);

        System.out.println("Animals of toto");
        for (int i = 0; i < c1.getAnimals().size(); i++) {
            Animal animal = c1.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Dog":
                    System.out.println("Dog");
                    break;
                case "Cat":
                    System.out.println("Cat");
                    break;
            }

        }
        AnimalKeeper<Vertebrate> keeper = new AnimalKeeper<>();
        Vertebrate dog = new Dog();
        System.out.println(dog.getEatCount());
        keeper.feed(dog, "steak");
        System.out.println(dog.getEatCount());
        Cleaner<Cage> cleaner = new Cleaner<>();
        cleaner.clean(c1);
    }
}
