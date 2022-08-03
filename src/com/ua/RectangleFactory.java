package com.ua;

public class RectangleFactory extends FigureFactory {
    @Override
    public Figure createFigure() {
        super.createFigure();
        return new Rectangle(3,5,Color.getColors());
    }
}
