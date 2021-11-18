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
public class L3E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double commission;
        
        System.out.print("Sales volume: ");
        double sales=sc.nextDouble();
        
        if(sales<=100){
            commission=sales*0.05;
        }else if(sales>100 && sales<=500){
            commission=sales*0.075;
        }else if(sales>500 && sales<=1000){
            commission=sales*0.1;
        }else{
            commission=sales*0.125;
        }
        
        System.out.printf("The total commission is: RM " + "%6.2f",commission);
    }
    
}
