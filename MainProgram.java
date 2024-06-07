/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bukotobankltd;

import java.util.Scanner;
import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bukoto Village Bank and Alexa Merchants ---");
            System.out.println("1. Calculate Investment Value");
            System.out.println("2. Compute Product, Sum, and Maximum of Three Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateInvestment(scanner);
                    break;
                case 2:
                    computeThreeNumbers(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to calculate investment value
    public static void calculateInvestment(Scanner scanner) {
        System.out.println("\n--- Calculate Investment Value ---");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualRate = scanner.nextDouble();
        double rate = annualRate / 100;

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Using a for loop to calculate compound interest
        double amount = principal;
        for (int i = 0; i < time * n; i++) {
            amount += amount * (rate / n);
        }

        System.out.printf("The value of the investment after %d years is: %.2f%n", time, amount);
    }

    // Method to compute product, sum, and maximum of three numbers
    public static void computeThreeNumbers(Scanner scanner) {
        System.out.println("\n--- Compute Product, Sum, and Maximum ---");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("-------------------");
        System.out.println("|    Metric       | Value |");
        System.out.println("-------------------");
        System.out.printf("|    Product      | %6d |\n", product);
        System.out.printf("|    Sum          | %6d |\n", sum);
        System.out.printf("|    Maximum      | %6d |\n", max);
        System.out.println("-------------------");
    }
}
