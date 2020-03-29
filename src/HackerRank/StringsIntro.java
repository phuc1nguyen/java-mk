package HackerRank;

import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A.length() + B.length());
        lexicoGraphically(A, B);
        String[] c = A.split("");
        c[0].toUpperCase();
        System.out.print(c[0].toUpperCase());
        for (int i=1; i<c.length; ++i) {
            System.out.print(c[i]);
        }
        System.out.print(" ");
        String[] d = B.split("");
        d[0].toUpperCase();
        System.out.print(d[0].toUpperCase());
        for (int i=1; i<d.length; ++i) {
            System.out.print(d[i]);
        }
    }
    public static void lexicoGraphically(String a, String b) {
        int n = a.compareTo(b);
        if (n>0) System.out.println("Yes");
        else System.out.println("No");
    }
}
