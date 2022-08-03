package com.dz;

public class Color {
    private String[] colors = {"Blue", "Red", "White","Green"};

    public String getColor() {

        return colors[(int) (Math.random() * colors.length)];
    }
}
