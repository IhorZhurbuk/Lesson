package com.midline;

public class Item {
    private int agility;
    private int intellect ;
    private int strength;
    private String name;

    public Item(int agility, int intellect, int strength, String name) {
        this.agility = agility;
        this.intellect = intellect;
        this.strength = strength;
        this.name = name;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

}
