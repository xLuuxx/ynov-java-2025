package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Enter an operator ( +, -, *, /, %) ");
        String operator = scanner.next();
        String resultadd = "The result of the addition is: " + (a + b);
        String resultsub = "The result of the subtraction is: " + (a - b);
        String resultmul = "The result of the multiplication is: " + (a * b);
        String resultdiv = "The result of the division is: " + (a / b);
        String resultmod = "The result of the modulo is: " + (a % b);

        if (operator.equals("+")) {
            System.out.println(resultadd);
        } else if (operator.equals("-")) {
            System.out.println(resultsub);
        } else if (operator.equals("*")) {
            System.out.println(resultmul);
        } else if (operator.equals("/")) {
            System.out.println(resultdiv);
        } else if (operator.equals("%")) {
            System.out.println(resultmod);
        } else


        if (operator != "+" || operator != "-" || operator != "*" || operator != "/" || operator != "%") {
            System.out.println("Please enter a correct operator");
        }
    }
}
