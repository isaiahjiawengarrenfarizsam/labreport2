import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

    public class Q4{
        public static int max; //Global variable
        public static int sum; //Global variable
        
            public static void main(String[] args){
  
                int num = 1; 
                ArrayList<Integer> a1 = new ArrayList<>();
                ArrayList<Integer> b1 = new ArrayList<>();
          
                Scanner sc = new Scanner(System.in);
                String counter = "A"; //Just to initialize and to make the while loop true.
                
                //Array 1 initialization.
                System.out.println("\nPlease enter the elements for Array 1 (Enter \"Yes\" to terminate)"
                                 + "\n__________________________________________________________________");
                while (!(counter.equalsIgnoreCase("Yes"))) {
                    System.out.println("Element " + num + " :");
                    a1.add(sc.nextInt());
                    System.out.println("Exit?");
                    counter = sc.next();
                    sc.nextLine();
                    num++;
                }
                counter = "A"; //Re-initialize.
                num = 1; //Re-initialize.
                
                //Array 2 initialization.
                System.out.println("__________________________________________________________________\n"
                                 + "Please enter the elements for Array 2 (Enter \"Yes\" to terminate)"
                                 + "\n__________________________________________________________________");
                while (!(counter.equalsIgnoreCase("Yes"))) {
                    System.out.println("Element " + num + " :");
                    b1.add(sc.nextInt());
                    System.out.println("Exit?");
                    counter = sc.next();
                    num++;
                }
                //To check whether the size of both arrays are the same.
                //To check whether either arrays exceeded 10 which is the maximum number of size.
                if ((a1.size() == b1.size()) && !(a1.size() > 10) && !(b1.size() > 10)) {
                //Array initialization.
                int[] a = new int[a1.size()];
                int[] b = new int[b1.size()];
               
                //Array List to Array for passing to method. 
                for (int i = 0; i < a1.size(); i++) {
                    a[i] = a1.get(i);
                    b[i] = b1.get(i);
                }
                    System.out.print("__________________________________________________________________\nArray a: "); printingArray(a);
                    System.out.print("\nArray b: "); printingArray(b);
                System.out.println("\nThe maximum sum of XOR values for both above arrays is " + maximumxorsum(a,b));}
                
                else if ((a1.size() > 10) && (b1.size() > 10)) { System.out.println("__________________________________________________________________\n"
                        + "Seems like the length of your arrays exceeded 10.\nPlease restart the program.");
                }
                
                else { System.out.println("__________________________________________________________________\n"
                        + "Seems like your arrays are not at the same length.\nPlease restart the program."); }
                }
            
            //Method to calculate maximum total values of XOR.
            public static int maximumxorsum(int[] a, int[] b) {
                
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < b.length; i++) {
                    arr.add(b[i]);
                }
                
                int answer;
                answer = permutations(a, arr, 0);
                return answer;
            }
            
            //Method to help to calculate.
                public static int permutations(int[] a, List<Integer> arr, int k) {
                    int check = 0, hold;
                  
                    for(int i = k; i < arr.size(); i++){
                    java.util.Collections.swap(arr, i, k);
                    permutations(a, arr, k+1);
                    java.util.Collections.swap(arr, k, i);
                }
                if (k == arr.size() -1){

                    for (int j = 0; j < arr.size(); j++){
                       check = arr.get(j) ^ a[j];
                       sum += check;
                }
                    hold = sum;
                    if (hold > max) {
                        max = sum;
                    }
                    sum = 0;

                }
                return max;
    } 
                //To print arrays.
                public static void printingArray (int[] a) {
                    
                    
                    System.out.print("{");
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]);
                        
                        if (i == (a.length - 1)) {
                            System.out.print("} ");
                        } else {
                            System.out.print(" ,");
                    }
                }
    } 
}