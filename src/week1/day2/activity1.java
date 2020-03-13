/* Reading Values from the User and display in console */

package week1.day2;

import java.util.Scanner;
public class activity1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; ++i) {
            for (int j=n-1; j>=i; --j)
                System.out.print(" ");
            for (int k=1; k<=(2*i)-1; ++k)
                System.out.print("*");
            System.out.println();
        }
    }
}

