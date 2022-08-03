package com.dz;

public class Circle  {
    private final String name = "Circle";
    private String color;
    private double perimeter;
    private double square;

    public Circle(int radius,String color) {
        this.color = color;
        perimeter = Math.PI * 2 * radius;
        square = Math.PI * Math.pow(radius, 2);
    }

    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
