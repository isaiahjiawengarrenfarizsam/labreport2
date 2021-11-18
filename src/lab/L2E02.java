/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;
//  Write a program to calculate the monthly payment for car loan.
import java.util.Scanner;

public class L2E02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Please enter the price of the car: RM ");
        float P = sc.nextFloat();
        
        System.out.print("Please enter the down payment: RM ");
        float D = sc.nextFloat();
        
        System.out.print("Please enter the interest rate in %: ");
        float R = sc.nextFloat();
        
        System.out.print("Please enter the loan duration in year: ");
        int Y = sc.nextInt();
        
        float M = ( P - D ) * ( 1 + R * Y / 100 ) / ( Y * 12 );
        
        System.out.println("***************************************************");
        System.out.printf("The monthly payment is: RM " + "%6.2f", M);
        
    }
    
}
