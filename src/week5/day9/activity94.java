/*Write a Java program to read contents from a file*/

package week5.day9;

import java.io.*;
import java.util.Scanner;

public class activity94 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your pathname: ");
        String s = sc.nextLine();

        try {
            fin = new FileInputStream(s);
            //fin = new FileInputStream("D:\\Books\\Upcoming read.txt");
            bin = new BufferedInputStream(fin, 10);

            int i = 0;
            while (true) {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            fin.close();
            bin.close();
        }
    }
}
