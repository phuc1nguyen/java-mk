/* Write a Java program to find all of the longest word in a input sentence */

package week2.day3;

import java.util.Arrays;
import java.util.Scanner;
public class activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longest = "";
        String bai33 = "";
        String[] arrBai33;

        System.out.println("Input a sentence to find the longest word: ");
        bai33 = sc.nextLine();
        arrBai33 = bai33.split(" ");
        System.out.println(arrBai33.length);

        for (int i=0; i < arrBai33.length; ++i) {
            String temp = arrBai33[i];
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }

        System.out.printf("The longest word is '%s'", longest);
    }
}
