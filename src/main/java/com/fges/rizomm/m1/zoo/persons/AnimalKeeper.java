package com.fges.rizomm.m1.zoo.persons;
import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Foods;


public class AnimalKeeper<T extends Animal> extends Employee {

    public void feed(T animal, String food) throws IllegalArgumentException {

        if(food != null){
            animal.eat(food);
        }
    }
}
