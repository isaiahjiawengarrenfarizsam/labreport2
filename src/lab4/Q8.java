/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Random;

/**
 *
 * @author User
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int n=rand.nextInt(101);
        System.out.println("First " + n + " prime numbers");
        
        int num_printed_prime=0;
        int prime=2; //smallest prime number
       
        while(num_printed_prime<n){
            boolean isPrime=true;
            for(int i=2; i<=prime/2; i++){
                if(prime%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(prime);
                num_printed_prime++;
            }
            prime++;
        }
    }
    
}
