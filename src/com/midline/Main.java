package com.midline;

public class Main {
    public static void main(String[] args) {
        Pudge pudge1 = new Pudge("Rydge");
        Pudge pudge2 = new Pudge("Пиджак");
        new Dota2Engine().fight(pudge1,pudge2);
    }
}
