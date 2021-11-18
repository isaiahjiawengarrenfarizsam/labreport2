/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**Write a program that stimulates a simple calculator. It reads two integers and a
character. If the character is a +, the sum is printed; if it is a -, the difference is
printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
*/

public class L3E01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int ans=0;
        
        System.out.print("Enter two integer number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand=sc.next().charAt(0);
        boolean valid=true;
        String equation="";
        
        switch (operand) {
            case '+' -> ans=num1+num2;
            case '-' -> ans=num1-num2;
            case '*' -> ans=num1*num2;
            case '/' -> ans=num1/num2;
            case '%' -> ans=num1%num2;
            default -> valid= false;
        }
        
        equation = valid ? num1 + " " + operand + " " + num2 + " = " + ans : "\n*** Invalid operation ***";
        System.out.println(equation);
        
        
        
            
        
        
    }
    
}
