package com.dota2;

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

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "Item{" +
                "agility=" + agility +
                ", intellect=" + intellect +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                '}';
    }
}
