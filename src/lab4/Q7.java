/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
            int P=sc.nextInt();
        
        System.out.print("Enter interest in %: ");
            double i = sc.nextDouble();
        
            while(i < 0 || i > 100) {
            System.out.println("Interest in % couldn't bigger than 100 or smaller than 0");
            System.out.print("Enter interest in %: ");
            i = sc.nextDouble();
        }
            
        System.out.print("Enter total number of month(s): ");
            int N=sc.nextInt();
            
        System.out.printf("%-10s%17s%17s%17s%20s%20s", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        int n=1;
        double M,C,L,R,totalInterest=0;
       
        while(n<=N){
            System.out.println(n);
            n++;  
           
        M=(P*(i/(12*100)))/(1-Math.pow(1+(i/(12*100)),-N));
        C = M*Math.pow(1+(i/(12*100)),-(1+N-n));
        L=M-C;
        R=(L/(i/(12*100)))-C;
        totalInterest+=L;
                
        System.out.println();
        System.out.printf("%-10d%17.2f%17.2f%17.2f%20.2f%20.2f",n,M,C,L,R,totalInterest);
                
            
        }
    
        
        
    }
    
}
