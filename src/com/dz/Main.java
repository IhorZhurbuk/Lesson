package com.dz;

import java.util.Scanner;

public class Main {
    private static final int size = 3;
    private static final Circle[] circles = new Circle[size];
    private static final Triangle[] triangles = new Triangle[size];
    private static final Rectangle[] rectangles = new Rectangle[size];
    private static int circleIndex;
    private static int triaIndex;
    private static int recIndex;

    public static void main(String[] args) {
        Color color = new Color();
        do {
            System.out.println("Create any shape!");
            System.out.println("1 - to circle");
            System.out.println("2 - to triangle");
            System.out.println("3 - to rectangle");
            System.out.println("9 - to exit");
            int number = check();

            if (number == 9) {
                break;
            }
            switch (number) {
                case 1:
                    if (circleIndex == size) {
                        System.out.println("Circle is full!");
                        break;
                    }
                    System.out.println("You choose circle!");
                    System.out.println("Write radius");
                    int radius = check();
                    Circle circle = new Circle(radius, color.getColor());
                    circles[circleIndex] = circle;
                    circleIndex++;
                    break;
                case 2: {
                    if (triaIndex == size) {
                        System.out.println("Triangle is full!");
                        break;
                    }
                    System.out.println("Your choose Triangle");
                    System.out.println("Write sides of the triangle");
                    int a = check();
                    int b = check();
                    int c = check();
                    if ((a + b) > c) {
                        Triangle triangle = new Triangle(a, b, c, color.getColor());
                        triangles[triaIndex] = triangle;
                        triaIndex++;
                        break;
                    }
                    System.out.println("Sum a plus b must be bigger then c");
                    break;
                }
                case 3: {
                    if (recIndex == size) {
                        System.out.println("Rectangle is full");
                        break;
                    }
                    System.out.println("Your choose Rectangle");
                    System.out.println("Write sides of the Rectangle");
                    int a = check();
                    int b = check();
                    Rectangle rectangle = new Rectangle(a, b, color.getColor());
                    rectangles[recIndex] = rectangle;
                    recIndex++;
                    break;
                }
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        } while (circleIndex != size || triaIndex != size || recIndex != size);
        printArray();
    }

    public static int check() {
        int number = 0;
        boolean validate;
        do {
            Scanner scanner = new Scanner(System.in);
            if (validate = scanner.hasNextInt()) {
                number = scanner.nextInt();
                validate = number > 0;
            }
            if (!validate) {
                System.out.println("Incorrect input");
            }
        } while (!validate);
        return number;
    }

    public static void printArray() {
        for (int i = 0; i < circleIndex; i++) {
            circles[i].printInfo();
            System.out.println("////////////////////////////////////////");
        }
        for (int i = 0; i < triaIndex; i++) {
            triangles[i].printInfo();
            System.out.println("////////////////////////////////////////");
        }
        for (int i = 0; i < recIndex; i++) {
            rectangles[i].printInfo();
            System.out.println("////////////////////////////////////////");
        }
    }
}

