/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers */

package week1.day1;

import java.util.Scanner;
public class activity2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.printf(a + " + " + b + " = " + (a+b) + "\n");
        System.out.printf(a + " - " + b + " = " + (a-b) + "\n");
        System.out.println(a + "x" + b + " = " + (a*b));
        System.out.println(a + "/" + b + " = " + (a/b));
        System.out.println(a + " mod " + b + " = " + (a%b));
    }
}
