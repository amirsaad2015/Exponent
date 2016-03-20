/*
Author: Amir Saad
This program implements two methods for calculating the power of a number.
*/

package exponent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exponent {

    public static double power1(int base, int power) {
           if(power < 0 || base < 0) {
               //Verify that power and base are positive 
               System.out.println("Please enter positive powers only.");
               System.exit(0);
           }
 
       double result = 1;
       
       while(power != 0) {
           result = result * base;
           power--;
       }
       
       return result;
    }
    
    public static double power2(int base, int power) {
        if(power < 0 || base < 0) {
               //Verify that power and base are positive 
               System.out.println("Please enter positive powers only.");
               System.exit(0);
           }
        
        if(power == 0) {
            return 1;
        }
        
        return base * power2(base, power - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 32;
        
        while(n > 0) {
            //Provoke both methods for increasing values of n up to n = 32
            System.out.println(power1(2, n));
            System.out.println(power2(2, n));
            n--;
        }
        
        try {
            //Verify user input
            System.out.print("Enter the base: ");
            int base = input.nextInt();
            
            System.out.print("Enter the power: ");
            int power = input.nextInt();
            
            System.out.println(base + " raised to the " + power + " is " + power2(base, power));
            
         } catch (InputMismatchException e) {
             System.out.println("Invalid input: Only positive bases and powers are allowed.");
             System.exit(0);
         }
    }  
}
