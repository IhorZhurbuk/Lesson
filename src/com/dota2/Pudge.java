package com.dota2;

import java.util.Arrays;

public class Pudge extends Hero {

    public Pudge(int agility, int intellect, int strength, int health, String name) {
        super(agility, intellect, strength, health, name);
        powerHit = (agility / 3) + (intellect / 2) + strength;
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
        return powerHit;
    }

    @Override
    void takeDamage(int damage) {
        int evade = (int) (Math.random() * 4);
        if (evade == 2) {
            return;
        }
        health -= damage;
    }

    @Override
    public String toString() {
        return "Pudge{" +
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
