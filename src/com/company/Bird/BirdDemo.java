package com.company.Bird;

public class BirdDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setNumberOfLegs(2);
        bird.setNumberOfWings(0);
        bird.setColor("black");

        System.out.println(bird.getColor());
        bird.walk();
        bird.fly();
        bird.sing(true);
    }
}
