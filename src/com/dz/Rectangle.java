package com.dz;

public class Rectangle {
    private final String name = "Rectangle";
    private String color;
    private double perimeter;
    private double square;

    public Rectangle(int a,int b,String color) {
        this.color = color;
        perimeter = 2 * (a + b);
        square = a * b;
    }
    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }

}
