package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Dog;
import com.fges.rizomm.m1.zoo.animals.Vertebrate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalKeeperTest {

    @Test
    void when_animal_keeper_feed_then_count_increment() {
        Vertebrate dog = new Dog();
        AnimalKeeper<Vertebrate> keeper = new AnimalKeeper<>();
        keeper.feed(dog, "CROQUETTE");
        Assertions.assertEquals(1, dog.getEatCount());
    }

    @Test
    void when_animal_keeper_give_child_as_food_then_notIncrement() {
        Vertebrate dog = new Dog();
        AnimalKeeper<Vertebrate> keeper = new AnimalKeeper<>();
        keeper.feed(dog, "child");
        Assertions.assertEquals(0, dog.getEatCount());
    }
}