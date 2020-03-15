/* Write a Java program to merge two given sorted array of integers and create a new sorted array */

package week2.day3;

import java.util.Arrays;
import java.util.Scanner;
public class activity32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first array length m = ");
        int m = sc.nextInt();
        System.out.print("Input second array length n = ");
        int n = sc.nextInt();
        int[] array1 = new int[m];
        int[] array2 = new int[n];

        // Nhap vao va hien thi mang thu nhat
        System.out.printf("Input %d elements of the first array: \n", m);
        for (int i = 0; i < array1.length; ++i) array1[i] = sc.nextInt();
        System.out.print("Mang thu nhat la: ");
        for (int item : array1) System.out.printf("%d ", item);
        System.out.println();

        // Nhap vao va hien thi mang thu hai
        System.out.printf("Input %d elements of the second array: \n", n);
        for (int i = 0; i < array2.length; ++i) array2[i] = sc.nextInt();
        System.out.print("Mang thu hai la: ");
        for (int item : array2) System.out.printf("%d ", item);
        System.out.println();

        // Nhap phan tu hai mang vao mang thu ba
        int[] array3 = new int[m + n];
        int k = 0;
        for (int i = 0; i < array1.length; ++i) {
            array3[k] = array1[i];
            ++k;
        }
        k = m;
        for (int i = 0; i < array2.length; ++i) {
            array3[k] = array2[i];
            ++k;
        }
        System.out.println("Mang thu ba chua sap xep la: " + Arrays.toString(array3));    // In ra mang thu ba khi chua sap xep

        // Sap xep phan tu mang thu ba
        int temp = 0;
        for (int i = 0; i < array3.length - 1; ++i) {
            for (int j = i + 1; j < array3.length; ++j) {
                if (array3[i] > array3[j]) {
                    temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }
        System.out.println("Mang thu ba sau khi sap xep la: " + Arrays.toString(array3));
    }
}
