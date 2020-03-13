/* Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both */

package week1.day2;

import java.util.Scanner;
public class activity4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a random number: ");
        int n = sc.nextInt();

        System.out.println("Divided by 3: ");   //Numbers which are divisible by 3
        for (int j=0; j<(n+1); ++j)
            if (j%3==0) System.out.print(j + ", ");
            System.out.print("\n");

        System.out.println("\nDivided by 5: ");   //Numbers which are divisible by 5
        for (int j=0; j<=n; ++j)
            if (j%5==0) System.out.print(j + ", ");
            System.out.print("\n");

        System.out.println("\nDivided by 3 & 5: ");     //Numbers which are divisible by both 3 and 5
        for (int j=0; j<=n; ++j)
            if ((j%3==0)&&(j%5==0)) System.out.print(j + ", ");
            System.out.print("\n");
    }
}
