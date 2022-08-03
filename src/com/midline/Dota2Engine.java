package com.midline;

import com.dota2.Hero;

public class Dota2Engine {

    private Bench bench;
    public void fight(Pudge pudge1, Pudge pudge2) {
        bench = new Bench();
        pudge1.takeItem(bench.saleRandomItem());
        pudge1.takeItem(bench.saleRandomItem());
        pudge2.takeItem(bench.saleRandomItem());
        pudge2.takeItem(bench.saleRandomItem());
        int counter = 1;

        do {
            System.out.println("Round " + counter);
            pudge1.takeDamage(pudge2.getPowerHit());
            System.out.println(pudge1.getName() + " take damage " + pudge2.getPowerHit() + " from " + pudge2.getName());
            if (pudge1.getHealthPower() <= 0) {
                pudge1.printInfo();
                pudge2.printInfo();
                break;
            }
            pudge2.takeDamage(pudge1.getPowerHit());
            System.out.println(pudge2.getName() + " take damage " + pudge1.getPowerHit() + " from " + pudge1.getName());
            pudge1.printInfo();
            pudge2.printInfo();
            System.out.println("///////////////////////////////////////////////////////////////");
            counter++;
        } while (pudge1.getHealthPower() >= 0 && pudge2.getHealthPower() >= 0);
        System.out.println("Winner is "  + (pudge1.getHealthPower() > pudge2.getHealthPower() ? pudge1.getName() : pudge2.getName()));
    }
}
