package week2.day3;

import java.util.Scanner;
public class activity42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String divide3 = "";
        String divide5 = "";
        String divide35 = "";

        for (int j=1; j<=n; ++j){
            if (j%3 == 0)
                divide3 = divide3 + "," + j;
            if (j%5 == 0)
                divide5 = divide5 + "," + j;
            if (j%3 == 0 && j%5 == 0)
                divide35 = divide35 + "," +j;
        }
        System.out.println(divide3.substring(1));
        System.out.println(divide5.substring(1));
        System.out.println(divide35.substring(1));
    }
}
