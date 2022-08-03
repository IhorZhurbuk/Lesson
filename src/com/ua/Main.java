package com.ua;

public class Main {
    public static void main(String[] args) {
        FigureFactory figureFactory = new CircleFactory();
        Figure figure = figureFactory.createFigure();
        figure.printInfo();
        FigureFactory figureFactory1 = new TriangleFactory();
        Figure figure1 = figureFactory1.createFigure();
        figure1.printInfo();
        FigureFactory figureFactory2 = new RectangleFactory();
        Figure figure2 = figureFactory2.createFigure();
        figure2.printInfo();
    }
}
