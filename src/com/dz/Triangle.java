package com.dz;

public class Triangle {
    private final String name = "Triangle";
    private String color;
    private double perimeter;
    private double square;

    public Triangle(int a,int b,int c, String color){
        this.color = color;
        perimeter = a + b + c;
        double p = perimeter / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }

}
