/* Write a Java program to find the length of the longest consecutive elements sequence
    from a given unsorted array of integers */
package week2.day3;

import java.util.Scanner;
public class activity31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your array of integers: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter your integers:");
        for (int i=0; i<n; ++i){
            array[i] = sc.nextInt();

        }
    }
}
