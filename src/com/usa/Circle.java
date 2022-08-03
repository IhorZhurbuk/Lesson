package com.usa;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void calculatePerimeter() {
        perimeter = Math.PI * 2 * radius;
    }

    @Override
    void calculateSquare() {
        square = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInfo() {
        String name = "Circle";
        System.out.println("Name " + name + "\nColor " + Color.getColors() + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
