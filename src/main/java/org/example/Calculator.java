package org.example;

import java.lang.Math;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        logger.info("Start of Execution");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Square root");
            System.out.println("2 - Logarithm");
            System.out.println("3 - Factorial");
            System.out.println("4 - Exponential");
            System.out.println("5 - Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Enter a valid choice.");
                logger.warn("Invalid input");
            }

            if (choice == 5) {
                logger.info("End of Execution");
                break;
            }

            else {

                double result, num;
                System.out.print("Enter number: ");
                num = sc.nextDouble();

                if (choice == 1) {
                    logger.info("START OP: SQUARE ROOT");
                    result = squareRoot(num);
                    logger.info("END OP: SQUARE ROOT");
                }

                else if (choice == 2) {
                    logger.info("START OP: LOGARITHM");
                    result = log(num);
                    logger.info("END OP: LOGARITHM");
                }

                else if (choice == 3) {
                    logger.info("START OP: FACTORIAL");
                    result = factorial(num);
                    logger.info("END OP: FACTORIAL");
                }

                else {
                    logger.info("START OP: EXPONENT");
                    System.out.print("Enter exponent: ");
                    double exponent = sc.nextDouble();
                    result = exponent(num, exponent);
                    logger.info("END OP: EXPONENT");
                }

                System.out.println("Result: " + result);
                System.out.println("");
            }
        }

        if (sc != null)
            sc.close();
    }
}