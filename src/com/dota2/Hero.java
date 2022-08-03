package com.dota2;

import java.util.Arrays;
import java.util.Objects;

public abstract class Hero {
    protected int agility;
    protected int intellect;
    protected int strength;
    protected int health;
    protected String name;
    protected int powerHit;
    protected  Item[] bag = new Item[2];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(int agility, int intellect, int strength, int health, String name) {
        this.agility = agility;
        this.intellect = intellect;
        this.strength = strength;
        this.health = health;
        this.name = name;

    }

    void takeItem(Item item) {

    }

    int hit() {
        return powerHit;
    }

    void takeDamage(int damage) {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return agility == hero.agility &&
                intellect == hero.intellect &&
                strength == hero.strength &&
                health == hero.health &&
                powerHit == hero.powerHit &&
                Objects.equals(name, hero.name) &&
                Arrays.equals(bag, hero.bag);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(agility, intellect, strength, health, name, powerHit);
        result = 31 * result + Arrays.hashCode(bag);
        return result;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "agility=" + agility +
                ", intellect=" + intellect +
                ", strength=" + strength +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", powerHit=" + powerHit +
                ", bag=" + Arrays.toString(bag) +
                '}';
    }
}

