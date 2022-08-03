package com.ua;

public class Circle extends Figure {
    private final String name = "Circle";

    public Circle(int radius, String color) {
        this.color = color;
        perimeter = Math.PI * 2 * radius;
        square = Math.PI * Math.pow(radius, 2);
    }
    @Override
    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
