package com.ua;

public class Color {
    private static final String[] colors ={"Blue", "Red", "White","Green"};

    public static String getColors() {

        return colors[(int) (Math.random() * colors.length)];
    }
}