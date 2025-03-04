package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Even Or Odd!");
        System.out.println("Choose a number");
        int choosenNumber = scanner.nextInt();
        if (choosenNumber % 2 == 0) {
            System.out.println(choosenNumber + " is an even number.");
        } else {
            System.out.println(choosenNumber + " is an odd number.");
        }
    }
}
