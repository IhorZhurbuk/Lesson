package com.ua;

public class Triangle extends Figure {
    private final String name = "Triangle";

    public Triangle(int a, int b, int c, String color) {
        if ((a + b) > c) {
            this.color = color;
            perimeter = a + b + c;
            double p = perimeter / 2;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("Incorrect input");
        }
    }
    @Override
    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
