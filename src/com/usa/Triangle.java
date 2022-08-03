package com.usa;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    void calculatePerimeter() {
        perimeter = a + b + c;
    }

    @Override
    void calculateSquare() {
        double p = perimeter / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public void printInfo() {
        String name = "Triangle";
        System.out.println("Name " + name + "\nColor " + Color.getColors() + "\nPerimeter " + perimeter + "\nSquare " + square);
    }
}
