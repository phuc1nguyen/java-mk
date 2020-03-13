/* Calculating the Percent Increase or Decrease of Financial Instruments */

package week1.tulam;

import java.util.Scanner;
public class StockChangeCalculator {
    static String s;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stock symbol: ");
        s = sc.nextLine();
        System.out.print("Enter " + s + "'s day 1 value: ");
        int a = sc.nextInt();
        System.out.print("Enter " + s + "'s day 2 value: ");
        int b = sc.nextInt();
        System.out.println(s + " has changed " + (b-a) + " in a day.");
    }
}

//String s = args[0];
//printf("Enter your stock symbol: " + s);
