/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

//Write a program that accepts an integer n from user and then sum the following series.
//1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
import java.util.Scanner;

public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
            int n=sc.nextInt();
        
        int sum=0;
        for(int i=1; i<=n; i++){ //run the addition n 
            for(int j=1;j<=i;j++){ //add the number from 1 to i
                sum+=j;
        }}
        System.out.print("Sum is: " + sum);
    }
    
}
