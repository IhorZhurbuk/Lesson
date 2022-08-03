package com.midline;

public class Pudge {
    private int agility = 12;
    private int intellect = 5;
    private int strength = 20;
    private int healthPower = 100;
    private String name;
    private int powerHit;
    private Item[] bag = new Item[2];

    public Pudge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void takeItem(Item item) {
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

    public void takeDamage(int damage) {
        healthPower -= damage;
    }


    public int getPowerHit() {
        return powerHit = (strength / 3) + (intellect / 2) + agility;
    }

    public void dropItem(String itemName) {
        for (Item i : bag) {
            if (i.getName().equals(itemName)) {
                i = null;
                intellect -= i.getIntellect();
                agility -= i.getAgility();
                strength -= i.getStrength();
            }
        }
    }


    public void printInfo() {
        StringBuilder result = new StringBuilder("Name " + name + "\nAgility " + agility + "\nIntellect " + intellect + "\nStrength " + strength + "\nHealth " + healthPower + "\nPowerHit " + getPowerHit() + "\n");
        for (Item i : bag) {
            if (i != null) {
                result.append(i.getName() + " ");
            }
        }
        System.out.println(result);
    }

}
