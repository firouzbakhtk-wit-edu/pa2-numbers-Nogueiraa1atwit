package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

    // TODO: document this function
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter coefficients a, b, and c
        System.out.printf("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Calculate the discriminant
        double d = b * b - 4 * a * c;
        
        // Check the nature of the roots based on the discriminant
        if (d < 0) {
            // If discriminant is negative, the roots are imaginary
            System.out.println("Roots: imaginary");
        } else if (d == 0) {
            // If discriminant is zero, there is one real root
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            // If discriminant is positive, there are two distinct real roots
            double root1 = (-b - Math.sqrt(d)) / (2 * a);
            double root2 = (-b + Math.sqrt(d)) / (2 * a);
            
            // Print the roots in ascending order
            double smallerRoot = Math.min(root1, root2);
            double largerRoot = Math.max(root1, root2);
            System.out.printf("Roots: %.2f, %.2f%n", smallerRoot, largerRoot);
        }
        
        // Close the Scanner object
        input.close();
    }
}

