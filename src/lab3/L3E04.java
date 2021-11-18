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
public class L3E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int diceA1,diceA2,diceB1,diceB2,sum1,sum2;
        
        System.out.print("Enter first dice score for player A: ");
        diceA1=sc.nextInt();
        
        System.out.print("Enter first dice score for player B: ");
        diceB1=sc.nextInt();
        
        System.out.print("Enter second dice score for player A: ");
        diceA2=sc.nextInt();
        
        System.out.print("Enter second dice score for player B: ");
        diceB2=sc.nextInt();
        
        sum1=diceA1+diceA2;
        sum2=diceB1+diceB2;
        
        if(sum1>sum2){
            System.out.println("Player A wins !");
        }else if(sum1==sum2){
            System.out.println("");
            System.out.println("Player B wins !");
        }
        
        
    }
    
}
