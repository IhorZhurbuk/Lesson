package com.ua;

public class Figure {
    protected String name;
    protected String color;
    protected double perimeter;
    protected double square;

    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
