/* Write a Java program that takes a number as input and prints its multiplication table upto 10 */

package week1.day1;

import java.util.Scanner;
public class activity3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        System.out.println("Your number's multiplication table upto 10: ");
        for (int j=1; j<=10; ++j)
            System.out.println(a + " x " + j + " = " + (a*j));
    }
}
