package com.ua;

public class TriangleFactory extends FigureFactory{
    @Override
    public Figure createFigure() {
        super.createFigure();
        return new Triangle(3,4,5,Color.getColors());
    }
}
