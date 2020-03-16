/* Write a Java program to remove the duplicate elements of a given array and return the new length of the array */

package week2.day3;

import java.util.Arrays;
import java.util.Scanner;
public class activity34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang so nguyen: ");
        int n = sc.nextInt();   // arr.length = n;
        int[] arr = new int[n];
        System.out.println("Nhap mang so nguyen co it nhat 1 phan tu bi trung: ");
        for (int i=0; i<arr.length; ++i) {
            arr[i] = sc.nextInt();
        }


        // In mang cuoi cung
//        System.out.println(Arrays.toString(arr));
    }
}
