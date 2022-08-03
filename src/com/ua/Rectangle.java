package com.ua;

public class Rectangle extends Figure {
    private String name = "Rectangle";

    public Rectangle(int a, int b, String color) {
        this.color = color;
        perimeter = 2 * (a + b);
        square = a * b;
    }
    @Override
    public void printInfo() {
        System.out.println("Name " + name + "\nColor " + color + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
