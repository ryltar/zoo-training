package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Dog;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

class AnimalKeeperTest {

    @Test
    void when_animal_keeper_feed_then_count_increment() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new AnimalKeeper();

        keeper.feed(dog, "steak");

        Assert.check(dog.getEatCount() == 1);
    }

    @Test
    void when_animal_keeper_give_child_as_food_then_error() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new AnimalKeeper();

        keeper.feed(dog, "child");

        Assert.check(dog.getEatCount() == 0);
    }
}