package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.lang.Math;

@SpringBootApplication
public class DevopsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Natural Logarithm (ln)");
        System.out.println("6. Square Root (√)");
        System.out.println("7. Factorial (!)");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + addition(num1, num2));
                break;
            case 2:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + subtraction(num1, num2));
                break;
            case 3:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + multiplication(num1, num2));
                break;
            case 4:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.println("Result: " + division(num1, num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case 5:
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                System.out.println("Result: " + log(num1));
                break;
            case 6:
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                System.out.println("Result: " + sqrt(num1));
                break;
            case 7:
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                System.out.println("Result: " + factorial(num1));
                break;
            case 8:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result:" + power(num1, num2));
            default:
                System.out.println("Invalid operation");
        }

    }


    public static double addition(double num1, double num2) {
        return num1+num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1-num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1*num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return num1 / num2;
    }

    public static double log(double num1) {
        if (num1 > 0) {
            return Math.log(num1);
        } else {
            throw new IllegalArgumentException("Logarithm of non-positive number");
        }
    }

    public static double sqrt(double num1) {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            throw new IllegalArgumentException("Square root of negative number");
        }
    }

    public static double factorial(double num1) {
        if (num1 == 0) {
            return 1;
        } else if (num1 > 0 && num1 == (int)num1) {
            int result = 1;
            for (int i = 1; i <= num1; i++) {
                result *= i;
            }
            return result;
        } else {
            throw new IllegalArgumentException("Factorial of non-positive integer");
        }
    }

    public static double power(double num1, double num2) {
        return Math.pow(num1,num2);
    }
}