package com.dz;

public class Task1 {

    public static void main(String[] args) {

        int total = 320;
        int discount = 7;

        if (total < 300) {
            discount = 0;
        } else if (total < 400) {
            discount = 3;
        } else if (total < 500) {
            discount = 5;
        }
        System.out.println("Your discount is " + discount + "%,total to pay:" + discount_price(total, discount));
    }

    public static double discount_price(int total, int discount) {
        return total - ((total * discount) / 100.0);
    }
}