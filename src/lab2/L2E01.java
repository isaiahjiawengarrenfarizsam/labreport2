/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;

/*Write a program that convert temp in degree Farenheit to degree Celsius.
 *This program will display the degree Celsius in two decimal place.
 */

public class L2E01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        float Farenheit;
        System.out.print("Please enter temperature in degree Farenheit: ");
        Farenheit=sc.nextFloat();
        
        float Celsius = ( Farenheit - 32 ) / 1.8f  ;
        
        System.out.printf("Degree in Celsius: " + "%6.2f", Celsius);

    }
    
}

//Some methods to display number in 2 decimal places
//-using String's format() method
//-String.format(%.2f,d)

//-using formatter
//   Formatter formatter = new Formatter();
//      formatter.format("%.2f",d);
//          System.out.println("Double up to 2 deciamal places:"+formatter.toString());
