package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int result = square(number);
        System.out.println("The square of " + number + " is: " + result);
    }

    public static int square(int number) {
        return number * number;
    }
}

