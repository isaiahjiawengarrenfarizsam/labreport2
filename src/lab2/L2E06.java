/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

//Write a program that calculates the energy needed to heat water
import java.util.Scanner;
public class L2E06 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int water;
        double Farenheit1;
        double Farenheit2;
        
        System.out.print("Enter the amout of water in gram: ");
        water=sc.nextInt();
        
        System.out.print("Enter the initial temperature in Farenheit: ");
        Farenheit1=sc.nextDouble();
        
        System.out.print("Enter the final temperature in Farenheit: ");
        Farenheit2=sc.nextDouble();
        
        double M = water / 1000 ;
        double final_temp = ( Farenheit2 - 32 ) / 1.8 ;
        double initial_temp = ( Farenheit1 - 32 ) / 1.8 ;
        double Q = M * (final_temp - initial_temp) * 4184;
        
        
        System.out.println("The energy needed is " + Q );
        
        
        
        
    }
    
}
