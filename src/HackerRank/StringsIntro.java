package HackerRank;

import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        //In ra tong do dai 2 chuoi
        System.out.println(A.length() + B.length());

        //Ham so sanh lexicographic, in ra yes hoac no
        lexicoGraphically(A, B);

        //In ra String1 String2, viet hoa chu cai dau tien moi tu
        /*String[] c = A.split("");
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
        }*/

        //Code nay toi uu hon :)
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
    }

    public static void lexicoGraphically(String a, String b) {
        int n = a.compareTo(b);
        if (n > 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
