package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter 1 for Normal customer\nEnter 2 for New registered customer\nEnter 3 for Old registered customer:");
        int customerType = input.nextInt();

        System.out.print("Input bills: ");
        int price = input.nextInt();

        input.close();

        var calculator = new discountCalculator();

        System.out.println("Moneh needed: " + calculator.discountCalculate(customerType, price));
    }
}
