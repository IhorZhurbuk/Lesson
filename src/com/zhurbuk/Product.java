package com.zhurbuk;

public class Product {
    private String name;
    private int price;
    private int vaga;

    public Product(String name, int price, int vaga) {
        this.name = name;
        this.price = price;
        this.vaga = vaga;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVaga() {
        return vaga;
    }
}
