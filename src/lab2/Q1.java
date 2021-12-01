/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;

//Write a program to check whether a triangle is valid or invalid. 
//If the triangle is valid, check whether a triangle is Equilateral, Isosceles or Scalene.
public class Q1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int side1, side2, side3;
        
        System.out.println("Enter length of each side of triangle: ");
            side1=sc.nextInt();
            side2=sc.nextInt();
            side3=sc.nextInt();
        
        if(side1+side2<=side3 || side2+side3<=side1 || side1+side3<=side2){
            System.out.println("Invalid triangle");
            
        }else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("Isosceles triangle");
        
        }else if(side1==side2 && side2==side3 ){
            System.out.println("Equilateral triangle");
            
        }else{
            System.out.println("Scalene triangle");
        }
         
    }
    
}
