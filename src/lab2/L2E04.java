/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

//Write a program that converts the seconds to hours, minutes and seconds.
import java.util.Scanner;
public class L2E04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int sec,hour,minute,seconds;
        
        System.out.print("Enter the number of seconds: ");
        sec=sc.nextInt();
        
        hour = sec / 3600;
        minute= ( sec % 3600 ) / 60;
        seconds=( ( sec % 3600 ) % 60 ) % 60;
        
        System.out.println(sec + " seconds is " + hour + " hours, " + minute + " minutes and " + seconds + " seconds");
        
        
        
        
    }
    
}
