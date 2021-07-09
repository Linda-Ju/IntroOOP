package com.company.Car;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("car.getColor() = " + car.getColor());
        car.setColor("Blue");
        System.out.println("car.getColor() = " + car.getColor());

        car.setNumberOfTires(8);
        car.setBrand("BMW Limousine");
        System.out.println("car.getNumberOfTires() = " + car.getNumberOfTires());
        System.out.println("car.getBrand() = " + car.getBrand());
        
        
        
//        System.out.println(Car.color);
//        System.out.println(Car.numberOfTires);
//        System.out.println(Car.brand);
//        car.startEngine(true);
    }
}
