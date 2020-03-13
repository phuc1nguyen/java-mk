/* Write a Java program to convert a decimal number to binary number */

package week1.day2;

import java.util.Scanner;
public class activity2 {
    public static void main(String[] args){
        int[] myArray = new int[15];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int i=0;

        while (n>0) {
            myArray[i++] = n%2;
            n=n/2;
        }
        for (int j=i-1; j>=0; --j)  // In array cua minh theo chieu nguoc lai
            System.out.print(myArray[j]);
    }
}
