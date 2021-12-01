/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        Scanner sc=new Scanner(System.in); 
        
        System.out.print("Enter number of students: ");
            int N=sc.nextInt();
        
        int[] score=new int[N];
        
        int total=0;
        int avg = 0;
        
        for(int i=0; i<score.length; i++){
            score[i]=rand.nextInt(100);
            System.out.println(i+". "+ score[i]);
            total=total+score[i];
            avg=total/N;
        }
      
        int max=0;
        int min=100;
        
        for(int i=0; i<score.length; i++){
            if(score[i]>max){
                max=score[i];  
            }
            if(score[i]<min){
                min=score[i];
            }
        }
       
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Average score: " + avg);
                    
                
    }
    
}
