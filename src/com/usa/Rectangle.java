package com.usa;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    void calculatePerimeter() {
        perimeter = 2 * (a + b);
    }

    @Override
    void calculateSquare() {
        square = a * b;
    }
    @Override
    public void printInfo() {
        String name = "Rectangle";
        System.out.println("Name " + name + "\nColor " + Color.getColors() + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
