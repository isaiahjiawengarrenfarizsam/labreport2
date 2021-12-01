/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Random;

/**
 *Write a simple two players dice game. Each player will take turns to roll a dice. The first players that reach more than 100 points win the game.
 *If the player rolls a 6, the player will score 6 points and has the chance to roll again.
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int score1=0;
        int score2=0;
        int dice;
        
        while(score1<=100 && score2<=100){
            do{
                System.out.print("Player 1's turn: ");
                dice=rand.nextInt(6)+1;
                score1+=dice;
                System.out.println(score1);
            }while(dice==6);
            
            do{
                System.out.print("Player 2's turn: ");
                dice=rand.nextInt(6)+1;
                score2+=dice;
                System.out.println(score2);
            }while(dice==6);
            
            System.out.println();
                
            }
        
        if(score1<100)
            System.out.println("Player 2 wins!");
        else
            System.out.println("Player 1 wins!");
            
        }
        
        
        
    }
    

