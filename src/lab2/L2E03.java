/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/*Write a program that generates three random numbers. 
*The range of the random number is 10 to 50. 
*Display the three numbers, sum of the numbers and the average in two decimal places.
*/

import java.util.Random;
public class L2E03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int num1,num2,num3;
        int max=50;
        int min=10;
        
        //to generate random number with range: (max - min + 1) + min
        num1=rand.nextInt(max - min + 1) + min; 
        num2=rand.nextInt(max - min + 1) + min; 
        num3=rand.nextInt(max - min + 1) + min; 
        
        System.out.print( "Random number: " );
        System.out.println(num1+" "+num2+" "+num3 );
      
        int sum = num1 + num2 + num3 ;
        double avg = sum / 3;
        
        System.out.println("Sum: " + sum );
        System.out.printf("Average: %6.2f\n",avg);
    }
    
}
