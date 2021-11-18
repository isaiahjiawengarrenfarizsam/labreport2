/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double radius;
        
        
        System.out.print("Enter radius of a circle: ");
        radius=sc.nextDouble();
        
        double x,y;
        
        System.out.print("Enter x coordinate: ");
        x=sc.nextDouble();
        
        System.out.print("Enter y coordinate: ");
        y=sc.nextDouble();
        
        System.out.println("The coordinate (x,y) :" + "(" + x + "," + y + ")");
        
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));//Pythagorean theorem
        System.out.printf("Distance: %.2f\n",distance);
        
        if(distance<radius)
            System.out.println("The coordinate point is inside the circle centered at (0,0).");
        else
            System.out.println("The coordinate point is outside the circle centered at (0,0)");
        
            
            
        
            
        
    }
    
}
