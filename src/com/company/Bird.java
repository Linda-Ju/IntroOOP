package com.company;

public class Bird {
    private String color;
    private int numberOfWings;
    private int numberOfLegs;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWing) {
        this.numberOfWings = numberOfWing;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void walk() {
        if (numberOfLegs == 2) {
            System.out.println("Bird can walk");
        } else {
            System.out.println("Bird cannot walk");
        }
    }

    public void fly() {
        if (numberOfWings == 2) {
            System.out.println("Bird can fly");
        } else {
            System.out.println("Bird cannot fly");
        }
    }

    public void sing(boolean voice) {
        if (voice) {
            System.out.println("Bird sings");
        } else {
            System.out.println("Bird can't sing");
        }
    }
}
