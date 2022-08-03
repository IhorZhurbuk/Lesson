package com.dz;

public class Bulb {
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(final int brightness) {
        this.brightness = brightness;
    }

    int brightness;
    boolean isOn;

    void print() {
        System.out.println("Brightness " + brightness + " " + "Bulb is " + (isOn ? "on" : "off"));
    }

    public void isBrightnessOn(boolean isOn) {
        isOn = isOn;
        this.isOn = isOn;
        if (isOn) {
            brightness = 100;
        } else {
            brightness = 0;
        }
    }
}
