package com.dota2;

public class Bench {
    public static Item[] items;

    public Item saleRandomItem() {
        return items[(int) (Math.random() * items.length)];
    }
}

