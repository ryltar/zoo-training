package com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {

    private String name;
    private int eatCount;
    private int statisfactionCount;
    private int health = 0;
    private String lastMeal;

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
        this.lastMeal = food;
        try{
            boolean canEat = Foods.valueOf(food.toUpperCase()).canEat(this);
            ++this.eatCount;
        }catch(IllegalArgumentException E){
            System.out.print("l'animal ne peut pas manger cette nourriture, ce n'est pas bon pour sa sante");
        }

    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStatisfactionCount() {
        return statisfactionCount;
    }

    public void caress(){
        this.statisfactionCount++;
    }

    public void setStatisfactionCount(int statisfactionCount) {
        this.statisfactionCount = statisfactionCount;
    }

    public String getLastMeal() {
        return lastMeal;
    }
}
