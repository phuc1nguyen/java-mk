/* Write a Java program to multiply two given integers without using the multiply operator(*) */

package week1.day2;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int product = 0;

        // Output
//        while (b!=0){
//            product = product + a;
//            --b;
//        }

        for (int i=b; i>0; --i)
            product = product + a;

        System.out.printf("Product of two number is %d", product);
    }
}
