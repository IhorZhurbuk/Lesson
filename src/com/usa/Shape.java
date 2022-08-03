package com.usa;

public abstract class Shape {
    protected String name;
    protected String color;
    protected double perimeter;
    protected double square;

    abstract void calculatePerimeter();

    abstract  void calculateSquare();

    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }

}
