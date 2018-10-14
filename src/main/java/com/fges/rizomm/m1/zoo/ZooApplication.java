package com.fges.rizomm.m1.zoo;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Cat;
import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.persons.AnimalKeeper;
import com.fges.rizomm.m1.zoo.persons.Person;

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

        Person toto = new Person();

        toto.addAnimal(gaia);
        toto.addAnimal(felix);

        System.out.println("Animals of toto");
        for (int i = 0; i < toto.getAnimals().size(); i++) {
            Animal animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Dog":
                    System.out.println("Dog");
                    break;
                case "Cat":
                    System.out.println("Cat");
                    break;
            }

        }

        AnimalKeeper keeper = new AnimalKeeper();
        Animal dog = new Dog();

        System.out.println(dog.getEatCount());
        keeper.feed(dog, "steak");
        System.out.println(dog.getEatCount());
    }
}
