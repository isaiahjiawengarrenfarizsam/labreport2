/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Random;

/**
 *
 * @author User
 */
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int[] num=new int[10];
        
        for(int i=0; i<num.length; i++){
            num[i]=rand.nextInt(20);
        }
        
        for(int i=0; i<num.length; i++){ 
            for(int j=0;j<num.length;j++){ 
                if(i==j)//avoid compare in itself. 
                { 
                } 
                else if(num[j]==num[i])//restart all the loop when it is a same number. 
                { 
                    num[j]=rand.nextInt(20); 
                    i=0; 
                    j=0; 
                } 
            } 
    }
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+" ");
    }
}
