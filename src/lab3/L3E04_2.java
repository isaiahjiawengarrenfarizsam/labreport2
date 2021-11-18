/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Random;

//using random number
public class L3E04_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int diceA1,diceA2,diceB1,diceB2,sum1,sum2;
        
        System.out.println("Round 1:");
        diceA1=rand.nextInt(6);
        System.out.println("First dice score for player A: " + diceA1);
        
        diceB1=rand.nextInt(6);
        System.out.println("First dice score for player B: " + diceB1);
        
        System.out.println("Round 2:");
        diceA2=rand.nextInt(6);
        System.out.println("Second dice score for player A: " + diceA2);
        
        diceB2=rand.nextInt(6);
        System.out.println("Second dice score for player B: " + diceB2);
        
        sum1=diceA1+diceA2;
        sum2=diceB1+diceB2;
        
        System.out.println("Score:");
        System.out.println("Player A: " + sum1);
        System.out.println("Player B: " + sum2);
        
        if(sum1>sum2){
            System.out.println("Player A wins !");
        }else if(sum1==sum2){
            System.out.println("");
            System.out.println("Player B wins !");
        }
    }
    
}
