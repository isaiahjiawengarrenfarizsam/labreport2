/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;

/**Write a program that generates one random number. 
 * The range of the random number is 0 to 10000. 
 * Display the number and the sum of all the digits in the number.
 */
import java.util.Random;
public class L2E05 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand=new Random();
        int num;
        
        num=rand.nextInt(10000); 
        System.out.println("The random number is: " + num);
        
        int sum=0;
        
        while( num>0 ){
            int last_digit = num % 10; //int remainder = num % 10;
            sum=sum+last_digit; //sum += remainder
            num=num/10; //num /= 10
        }
        
      
        System.out.println("Sum of all digits: "+ sum);
        
    }
    
}
