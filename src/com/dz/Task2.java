package com.dz;

public class Task2 {

    public static void main(String[] args) {
        int total = 478;
        int discount;
        switch (total / 100) {
            case 0:
            case 1:
            case 2:
                discount = 0;
                break;
            case 3:
                discount = 3;
                break;
            case 4:
                discount = 5;
                break;
            default:
                discount = 7;
                break;
        }
        System.out.println("Your discount is " + discount + "%,total to pay:" + (total - ((total * discount) / 100.0)));

    }
}