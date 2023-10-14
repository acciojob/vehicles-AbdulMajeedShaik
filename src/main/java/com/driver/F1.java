package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 7, isManual, "Formula 1", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        int newGear = calculateGear(newSpeed);

        if (newSpeed <= 0) {
            newGear = 1; // Set the gear to 1 when stopped
        }

        if (newSpeed >= 0) {
            changeGear(newGear);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    private int calculateGear(int speed) {
        if (speed <= 0) {
            return 1;
        } else if (speed <= 50) {
            return 1;
        } else if (speed <= 100) {
            return 2;
        } else if (speed <= 150) {
            return 3;
        } else if (speed <= 200) {
            return 4;
        } else if (speed <= 250) {
            return 5;
        } else {
            return 6;
        }
    }
}
