/*Write a Java program to check if a file or directory specified by pathname exists or not*/

package week5.day9;

import java.io.File;
import java.util.Scanner;

public class activity93 {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your pathname: ");
        s = sc.nextLine();
        File dirFolder = new File(s);

        if (dirFolder.exists() && dirFolder.isDirectory()) {
            System.out.println("This specified folder does exist.");
        } else {
            System.out.println("This specified folder does not exist.");
        }

        if (dirFolder.exists() && !dirFolder.isDirectory()) {
            System.out.println("This specified file does exist.");
        } else {
            System.out.println("This specified file does not exist.");
        }

    }
}
