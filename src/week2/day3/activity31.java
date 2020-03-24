/* Write a Java program to find the length of the longest consecutive elements sequence
    from a given unsorted array of integers */
package week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class activity31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your array of integers: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter your integers:");
        for (int i=0; i<n; ++i) array[i] = sc.nextInt();

        System.out.println("Your array: " + Arrays.toString(array));

        int count = 1;
        int longestCES = 0;     //CES = longest consecutive elements sequence
        boolean isConsecutive = true;

        for (int i=0; i<array.length; ++i) {
            if ((i+1) != n) isConsecutive = array[i+1] - array[i] == 1;
            if (isConsecutive) {
                count++;
                if (count > longestCES) {
                    longestCES = count;
                }
            } else count = 1;
        }

        System.out.printf("The length of the longest consecutive elements sequence is %d", longestCES);
    }
}
