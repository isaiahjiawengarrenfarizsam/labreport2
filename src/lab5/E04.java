/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author User
 */
public class E04 {
    
    static int N = 3;
 
    // Function to rotate the matrix 90 degree clockwise
    static void rotate90Clockwise(int arr[][])
    {
        // printing the matrix on the basis of
        // observations made on indices.
        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 5, 7},
                        { 3, 6, 9},
                        { 5, 3, 8}};
        rotate90Clockwise(arr);
    }
}
    
    

