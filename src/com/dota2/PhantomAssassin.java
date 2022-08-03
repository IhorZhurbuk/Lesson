package com.dota2;

import java.util.Arrays;

public class PhantomAssassin extends Hero {

    public PhantomAssassin(int agility, int intellect, int strength, int health, String name) {
        super(agility, intellect, strength, health, name);
        powerHit = (strength / 3) + (intellect / 2) + agility;
    }


    @Override
    void takeItem(Item item) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == null) {
                bag[i] = item;
                intellect += item.getIntellect();
                agility += item.getAgility();
                strength += item.getStrength();
                break;
            }
        }
    }

    @Override
    int hit() {
        int critic = (int) (Math.random() * 5);
        if (critic == 3) {
            return powerHit * 3;
        }
        return powerHit;
    }

    @Override
    void takeDamage(int damage) {
        int evade = (int) (Math.random() * 5);
        if (evade == 2) {
            return;
        }
        health -= damage;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PhantomAssassin{" +
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
