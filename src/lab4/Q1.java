/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

//Write a program that accepts an integer from user. Then, display its entire factors in increasing order

import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int factor;
        
        System.out.print("Enter an Integer: ");
            int n=sc.nextInt();
        
        System.out.print("The factors are: ");
        for(int i=1; i<=n; i++){
            if(n%i==0 && i<n){
                System.out.print(i + ", " );
            }else if(n==i){
                System.out.print(i);
            }
            
        }
        
    }
    
}
