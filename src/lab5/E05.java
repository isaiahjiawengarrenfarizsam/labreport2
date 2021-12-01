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
public class E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int[] num=new int[20];
        
        System.out.println("A list of 20 random integer within 0 to 100");
        
        for(int i=0; i<num.length; i++){
            num[i]=rand.nextInt(100);
            System.out.print(num[i]+" ");
            
        }
        
        System.out.println("Array in descending order");
        
        //bubble sort in descending order
        for(int pass=1; pass<num.length; pass++){
            for(int i=0; i<num.length; i++){
                if(num[i]>num[i+1]){
                    int hold=num[i];
                    num[i]=num[i+1];
                    num[i+1]=hold;
                    System.out.print(num[i] + " ");
                }
            }
        }
    
        System.out.print("Enter a number to search: ");
        
        int numToSearch = 0;
        for (int i = 0; i < 20; i++) {
            if (num[i] == numToSearch) {
                System.out.println(numToSearch + " found");
                System.out.println("Linear Search - " + i + " loop(s)");
    }
}
}}
