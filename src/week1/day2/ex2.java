/* Print fibonacci with max length from user input */
package week1.day2;

import java.util.Arrays;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input fibonacci length: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<array.length; ++i){
            if (i <= 1) array[i] = i;
            else array[i] = array[i-1] + array[i-2];
            System.out.print(array[i] + " ");
        }
    }
}
