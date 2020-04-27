/*Write a Java program to get specific files by extensions from a specified folder*/

package week5.day9;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class activity92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your pathname: ");
        String s = sc.nextLine();
        File dirFolder = new File(s);
        File[] listF = dirFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".jpg")) return true;
                else return false;
            }
        });
        for (File item : listF) {
            System.out.println(item);
        }
    }
}
