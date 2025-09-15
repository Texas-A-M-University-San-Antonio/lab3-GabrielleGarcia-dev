/**
 * Name: Gabrielle Garcia
 * Date: 14 September 2025
 * Purpose: Lab 3 - This program will calculate the future value of a home
 * using the compound interest formula. The user will input the initial
 * home value, number of years, and annual interest rate.
 */

import java.util.Scanner; // Import Scanner for user input

public class Lab3_Gabrielle_Garcia
{
    public static void main(String[] args) 
    {
        // Create Scanner object to accept keyboard input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double initialValue;  // initial value of the home (P)
        int years;            // number of elapsed years (t)
        double interestRate;  // interest rate in percent
        double finalValue;    // final value of the home (A)

        // Step 1: Prompt the user for the initial value of the home
        System.out.print("Please enter the initial value of the home: ");
        initialValue = input.nextDouble();

        // Step 2: Prompt the user for the number of elapsed years
        System.out.print("Please enter the number of elapsed years: ");
        years = input.nextInt();

        // Step 3: Prompt the user for the interest rate
        System.out.print("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        // Step 4: Convert percentage interest rate to decimal
        interestRate = interestRate / 100;

        // Step 5: Calculate the final value using compound interest formula
        // Formula: A = P * (1 + r)^t
        finalValue = initialValue * Math.pow((1 + interestRate), years);

        // Step 6: Display the final value of the home
        System.out.printf("The final value of the home is: %.2f%n", finalValue);
    }
}
