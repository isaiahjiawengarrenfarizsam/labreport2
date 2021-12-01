/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Scanner;

public class Q3 {

        public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int a, b, c; 
            
            //input variable a, b and c
            System.out.print("Enter value of a which are between 1-9 (ax^2+bx+c): ");
                a = sc.nextInt();
        
            System.out.print("Enter value of b which are between 1-9 (ax^2+bx+c): ");
                b = sc.nextInt();
        
            System.out.print("Enter value of c which are between 1-9 (ax^2+bx+c): ");
                c = sc.nextInt();
        
            System.out.println("\nThe quadratic equation : " + a + "x^2+" + b + "x+" + c);
        
            //calculate b^2– 4ac
            double determinant = b * b - 4 * a * c;
       
            double root1, root2;
             
            //determine the existence of roots
            if(determinant<0){
                System.out.println("\nThis quadratic equation has 0 root(s).");
                System.out.println("No solution.");
                
            }else if(determinant==0){
                System.out.println("This quadratic equation has 1 root(s).");
                root1 = root2 = - b  / ( 2 * a ); 
                System.out.println("x = "+ root1);
                
            }else{
                System.out.println("The quadratic equation had 2 root(s).");
                root1 = ( - b + Math.sqrt ( determinant ) ) / ( 2 * a );
                root2 = ( - b - Math.sqrt( determinant ) ) / ( 2 * a );
                System.out.println("X = " + root1);
                System.out.println("X = " + root2);
                
            }    
     
    }
    
}
