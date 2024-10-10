package edu.wit.cs.comp1000;

import java.util.Scanner;


public class PA2b {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        
        double d=b*b-4*a*c;
        
        
        if (d<0) {
           
            System.out.println("Roots: imaginary");
        } else if (d==0) {
           
            double root =-b/(2*a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            
            double root1 = (-b - Math.sqrt(d))/(2*a);
            double root2 = (-b + Math.sqrt(d))/(2*a);
            
            
            double smallerRoot = Math.min(root1, root2);
            double largerRoot = Math.max(root1, root2);
            System.out.printf("Roots: %.2f, %.2f%n", smallerRoot, largerRoot);
        }
        
        
        input.close();
    }
}

