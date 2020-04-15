/*Write a Java program to get a list of all file/directory names from the given*/

package week5.day9;

import java.io.File;
import java.util.Scanner;

public class activity91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your pathname: ");
        String s = sc.nextLine();
        File dirFolder = new File(s);
        File[] listFiles = dirFolder.listFiles();

        for (File file : listFiles) {
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getTotalSpace());
            System.out.println();
        }
    }
}
