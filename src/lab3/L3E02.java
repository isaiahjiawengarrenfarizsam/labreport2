//Generate a random integer within 0 to 5 and display the integer in word
package lab3;
import java.util.Random;
/**
 *
 * @author User
 */
public class L3E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int num=rand.nextInt(6);
        
        switch(num){
            case 0:
                System.out.println( num + " is zero.");
                break;
            case 1:
                System.out.println(num + " is one.");
                break;
            case 2:
                System.out.println(num + " is two.");
                break;
            case 3:
                 System.out.println( num + " is three.");
                break;
            case 4:
                System.out.println(num + " is four.");
                break;
            case 5:
                System.out.println(num + " is five.");
                break;
            default:
                System.out.println(num + " is not number.");
        }
        
        
    }
    
}
