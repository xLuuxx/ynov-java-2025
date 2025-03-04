package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name ?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
