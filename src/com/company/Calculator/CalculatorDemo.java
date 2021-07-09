package com.company.Calculator;

import com.company.Calculator.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum = calculator.addValues(2, 4, 8, 9, 10, 11, 23, 25);

//        System.out.println("sum = " + sum);
//        System.out.println(calculator.addValues(22, 11, 4));

        int difference, product;
        float quotient, average;

        difference = calculator.subtractValues(60,30);
        product = calculator.multiplyValues(3,4,2,5);
        quotient = calculator.divideValues(40,20);
        average = calculator.averageOfValues(2,3,8,19,29,30);

        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("average = " + average);
    }
}
