/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Scanner;

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int i=0;
        double sum=0;
        double avg;
        double square;
        double sumSquare=0;
        int max=0;
        int min=100; //assign min with a max value, so can compare with min value, and min=min value instead of assigned min value
        
        int score;
        while(true){
            System.out.print("Enter a score (negative score to quit):");
                score=sc.nextInt();
                
                //exit while loop when score is -ve
                if(score<0)break;
                
                sum+=score;
                square=score*score;
                sumSquare=sumSquare+square;
                
                if(score<min)min=score;
                if(score>max)max=score;
                i++;
        }
       
            
        System.out.println("Minumum Score: " + min);
        System.out.println("Maximum Score: " + max);
        
        avg=sum/i;
        System.out.printf("Average score: %.2f\n",avg);
        
        double s=Math.sqrt(((sumSquare)-(Math.pow(sum,2))/i)/(i-1));
        System.out.printf("Standard deviation: %6.2f\n",s);

        
    }
    
}
