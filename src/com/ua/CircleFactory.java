package com.ua;

public class CircleFactory extends FigureFactory {
    @Override
    public Figure createFigure() {
        super.createFigure();
        return new Circle(3,Color.getColors());
    }
}
