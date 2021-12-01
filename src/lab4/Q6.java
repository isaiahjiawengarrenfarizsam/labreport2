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
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int n=rand.nextInt(Integer.MAX_VALUE); //non-negative random value
        
        System.out.println(n);
        
        
        int i=0;
        while(n>0){
            n/=10;
            i++;
        }
        System.out.println("Number of digits: " + i);
        
        /*
        String num_string=Integer.toString(num);
        System.out.println("Number of digits: "+num_string.length());
        */
    }
    
}
