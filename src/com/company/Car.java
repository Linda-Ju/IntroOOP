package com.company;

public class Car {
    private String color = "Green";
    private int numberOfTires = 4;
    private String brand = "BMW";

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Engine switched on!");
        } else {
            System.out.println("Please insert the key!");
        }
    }

    public void stopEngine() {
        System.out.println("Engine switched off!");
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
