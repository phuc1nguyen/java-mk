/* Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn */

package week1.day2;

import java.util.Scanner;
public class activity3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n = ");
        int n = sc.nextInt();
        System.out.println("The value of n + nn + nnn is");
        System.out.printf("%d + %d + %d = " + String.valueOf(n + (n*10+n) + (n*100+n*10+n)), n, n*10+n, n*100+n*10+n);
    }
}