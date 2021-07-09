package com.company.Person_Encasulation;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people do you want to create?: ");
        Person[] persons = new Person[scanner.nextInt()];

        // iteratively create new person and add them to the array
        for (int i = 0; i < persons.length; i++) {

            Person person = new Person();

            System.out.print("Enter your first name: ");
            person.setFirstName(scanner.next());
            System.out.print("Enter your last name: ");
            person.setLastName(scanner.next());
            System.out.print("Enter your age name: ");
            person.setAge(scanner.nextInt());

            persons[i] = person;
        }
        System.out.println("Average age is: " + Average.averageOfValues(persons));
    }
}
