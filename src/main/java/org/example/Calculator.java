package org.example;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {

    public static double squareRoot(double n) {
        if (n < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        double result = Math.sqrt(n);
        return result;
    }

    public static double factorial(double n) {
        if (n < 0 || Math.floor(n) != n) {
            System.out.println("Invalid Input");
            return -1;
        }

        double result = 1;

        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }

    public static double log(double n) {
        if (n < 0) {
            System.out.println("Invalid Input");
            return -1;
        }

        double result = Math.log(n);

        return result;
    }

    public static double exponent(double a, double n) {
        double result = Math.pow(a, n);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double result, n, exponent;

        while (true) {
            System.out.println("1 - Square root");
            System.out.println("2 - Logarithm");
            System.out.println("3 - Factorial");
            System.out.println("4 - Exponential");
            System.out.println("5 - Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter number: ");
            n = sc.nextDouble();

            if (choice == 1) {
                result = squareRoot(n);
                System.out.println("Result: " + result);
                System.out.println("");
            }

            if (choice == 2) {
                result = log(n);
                System.out.println("Result: " + result);
                System.out.println("");
            }

            if (choice == 3) {
                result = factorial(n);
                System.out.println("Result: " + result);
                System.out.println("");
            }

            if (choice == 4) {
                System.out.print("Enter exponent: ");
                exponent = sc.nextDouble();
                result = exponent(n, exponent);
                System.out.println("Result: " + result);
                System.out.println("");
            }

        }

        if (sc != null)
            sc.close();
    }
}
