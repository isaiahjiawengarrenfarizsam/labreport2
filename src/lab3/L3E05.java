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
public class L3E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int a,b,c,d,e,f;
        int x,y;
        
        System.out.print("Enter value of a,b and e for equation 1(ax+by=e): ");
        a=sc.nextInt();
        b=sc.nextInt();
        e=sc.nextInt();
        
        System.out.print("Enter value of c,d and f for equation 2(cx+dy=f): ");
        c=sc.nextInt();
        d=sc.nextInt();
        f=sc.nextInt();
        
        x = ( e * d - b * f ) / ( a * d - b * c );
        y = ( a * f - e * c) / ( a * d - b * c);
        
        if(( a*d-b*c)==0){
            System.out.println("The equation has no solution");      
        }else{
            System.out.println("x is " + x + " ; y is " + y);
        }
            
    }
    
    
}
