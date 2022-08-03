package com.usa;

import com.dota2.Hero;

import java.util.Scanner;

public class Engine {
    final int size = 9;
    int index = 0;
    int number;
    Shape[] shapes = new Shape[size];



    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Create any shape!");
            System.out.println("1 - to circle");
            System.out.println("2 - to triangle");
            System.out.println("3 - to rectangle");
            System.out.println("0 - to exit");

            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            switch (number) {
                case 1:
                    System.out.println("You choose circle!");
                    System.out.println("Write radius");
                    int radius = scanner.nextInt();
                    Circle circle = new Circle(radius);
                    circle.calculatePerimeter();
                    circle.calculateSquare();
                    shapes[index] = circle;
                    index++;
                    break;
                case 2: {
                    System.out.println("Your choose Triangle");
                    System.out.println("Write sides of the triangle");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    if ((a + b) > c) {
                        Triangle triangle = new Triangle(a, b, c);
                        triangle.calculatePerimeter();
                        triangle.calculateSquare();
                        shapes[index] = triangle;
                        index++;
                        break;
                    }
                    System.out.println("Sum a plus b must be bigger then c");
                    break;
                }
                case 3: {
                    System.out.println("Your choose Rectangle");
                    System.out.println("Write sides of the Rectangle");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(a, b);
                    rectangle.calculatePerimeter();
                    rectangle.calculateSquare();
                    shapes[index] = rectangle;
                    index++;
                    break;
                }
                default:
                    System.out.println("Incorrect input");
                    break;
            }

        } while (index != size);
        scanner.close();
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.printInfo();
                System.out.println("///////////////////////////////////////////////////////////////");
            }
        }
    }
}
