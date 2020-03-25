/* Write a Java program to remove the duplicate elements of a given array and return the new length of the array */

package week2.day3;

import java.util.Scanner;
public class activity34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang so nguyen: ");
        int n = sc.nextInt();   // arr.length = n;
        while (n<2) {
            System.out.print("Moi nhap lai chieu dai toi thieu la 2: ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];

        System.out.println("Nhap mang so nguyen: ");
        for (int i=0; i<arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Chieu dai moi cua mang la: " + array_sort(arr));
    }

    public static int array_sort(int[] nums) {              //??
        int temp = 1;
        for (int i=1; i<nums.length; ++i) {
            if (nums[i] != nums[temp-1])
                nums[temp++] = nums[i];
        }
        return temp;
    }
}
