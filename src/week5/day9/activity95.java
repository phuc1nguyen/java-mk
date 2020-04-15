/*Write a Java program to find the longest word in a text file*/

package week5.day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class activity95 {
    private static String s = "";
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Input your pathname: ");
        s = sc.nextLine();
        getLongestWord();
    }

    public static void getLongestWord() throws FileNotFoundException {
        String longest = "";
        String temp;
        Scanner sc = new Scanner(new File(s));

        while (sc.hasNext()) {
            temp = sc.next();
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }

        longest.replaceAll("\\W", " ");
        System.out.println(longest);
        return;
    }
}
