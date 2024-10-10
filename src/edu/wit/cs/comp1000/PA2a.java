package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * Solution to the second programming assignment.
 * When it runs it outputs multiple statistics 
 * based on the whole numbers inputed by the user.
 * 
 * @author Aiden Nogueira
 */
public class PA2a {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int sumPositive = 0;
        int sumNonPositive = 0;
        int sumAll = 0;
        int countPositive = 0;
        int countNonPositive = 0;

       
        System.out.printf("Enter five whole numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        
        sumAll = num1 + num2 + num3 + num4 + num5;
/**
 * Checks each number to whether it's positive or non-positive.
 */
        
        if (num1>0) {
            sumPositive+=num1; // Adds num1 to the sum of positive whole numbers
            countPositive++; // Tracks the number of positive numbers entered 
        } else {
            sumNonPositive += num1; // Adds num1 to the sum of non-positive whole numbers
            countNonPositive++; // Tracks the number of non-positive numbers entered 
        }

        if (num2>0) {
            sumPositive += num2;
            countPositive++;
        } else {
            sumNonPositive += num2;
            countNonPositive++;
        }

        if (num3>0) {
            sumPositive += num3;
            countPositive++;
        } else {
            sumNonPositive += num3;
            countNonPositive++;
        }

        if (num4>0) {
            sumPositive += num4;
            countPositive++;
        } else {
            sumNonPositive += num4;
            countNonPositive++;
        }

        if (num5>0) {
            sumPositive += num5;
            countPositive++;
        } else {
            sumNonPositive += num5;
            countNonPositive++;
        }

        
        double averageAll = sumAll/5.0;
        double averagePositive = countPositive > 0 ? (double) sumPositive/countPositive : 0;
        double averageNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0;
        // Avoids division by zero if there are no positive or non-postive numbers entered
        
        System.out.println("\nThe sum of the " + countPositive + " positive numbers: " + sumPositive);
        System.out.println("The sum of the " + countNonPositive + " non-positive numbers: " + sumNonPositive);
        System.out.println("The sum of the 5 numbers: " + sumAll);
        System.out.printf("The average of the %d positive numbers: %.2f\n", countPositive, averagePositive);
        System.out.printf("The average of the %d non-positive numbers: %.2f\n", countNonPositive, averageNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f\n", averageAll);

        input.close();
    }
}
