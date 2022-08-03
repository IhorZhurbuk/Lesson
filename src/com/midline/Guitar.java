package com.midline;

public class Guitar {
    private String sound;

    public void playSound() {
        System.out.println(new Combo().amplifySound());
    }

    class Combo {
        public String amplifySound() {
            return sound.toUpperCase();
        }
    }
}
