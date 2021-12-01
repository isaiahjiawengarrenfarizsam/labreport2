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
public class E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        
        System.out.print("Enter number of employee: ");
            int N=sc.nextInt();
        
        System.out.println("No \tD1 \tD2 \tD3 \tD4 \tD5 \tD6 \tD7 \tTotal");
        int[][] hour=new int[N][7];
        
        for(int i=1; i<=hour.length; i++){
            System.out.print(i + "\t");
            int total=0;
            for(int j=0; j<7; j++){
                int hour=rand.nextInt(8)+1;
                total+=hour;
                System.out.print(hour+ "\t");
                
            }
            System.out.println(total + "\n");
        }
            
    }
    
}
