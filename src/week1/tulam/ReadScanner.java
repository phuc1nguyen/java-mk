/*Reading Values from the User and Performing Operations Using the Scanner Class */

package week1.tulam;

import java.util.Scanner;
public class ReadScanner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("The sum is " + (a+b) + ".");
    }
}
