package com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {

    private String name;

    private int eatCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    abstract String scream();

    public void eat(String food) {
        this.eatCount++;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }
}
