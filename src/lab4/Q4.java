/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Scanner;

/*
 *Write a program that ask user to enter the year and the first day of the year (0 for Sunday, 1 for Monday, … , 6 for Saturday). 
 *Display the calendar for May and August.
 */
public class Q4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a year: ");
            int year=sc.nextInt();
        
        System.out.print("Enter the first day of the year: ");
            int day=sc.nextInt();
        
        
        int mday = 0;
        if ((year%4==0) && (year%100!=0) || (year%400==0)) {
                mday=31+29+31+30;
        } else {
                mday=31+28+31+30;
        }
        
        //indicate first day of May
        day+=mday; //day=day+mday
        day%=7; //day=day%7, to find the first day of May
        
        
        //May
        System.out.println(".".repeat(40)+ " May " + ".".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");
        
        //get the location of the first day of the month
        for(int i=0; i<day; i++){
            System.out.printf("%13s"," ");      
        }
            
        // Print the days 
        for (int daysDisplay = 1; daysDisplay <= 31; daysDisplay++){
            System.out.printf("%13d",daysDisplay);
            day++;
            
            if (day%7 == 0)
                System.out.println();
        }   
               
        System.out.println("\n\n");
        
        //August
        day+=30+31;
        day%=7;
        
        System.out.println(".".repeat(40)+ " August " + ".".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");
        
        for(int i=1;i<=day;i++)
            System.out.printf("%13s"," ");
        
        for(int daysDisplay=1; daysDisplay<=31; daysDisplay++){
            System.out.printf("%13d",daysDisplay);
            day++;
            
            if(day%7==0)
                System.out.println();
            
        }
        
        System.out.println();
     }
 
}
