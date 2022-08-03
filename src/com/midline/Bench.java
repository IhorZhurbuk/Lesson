package com.midline;

public class Bench {
    private Item[] items = {new Item(10, 10, 10, "Aganim Scepter"),
            new Item(1, 1, 1, "Iron Branch"),
            new Item(14, 0, 10, "Dragon Lance"),
            new Item(30, 0, 0, "Butterfly")};

    public Item saleRandomItem() {
        return items[(int) (Math.random() * items.length)];
    }
}
