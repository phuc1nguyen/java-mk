/* Write a program to produce the sum and average of 1,2,3,....,n with n is input from user. */

package week1.day2;

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0, j=1;
        float average;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Su dung vong lap for
        for (int i=0; i<n; ++i) {
            sum += (i+1);
        }

        // Su dung vong lap while
//        while (j<=n){
//            sum += j;
//            ++j;
//        }

        // Su dung vong lap do-while
//        do{
//            sum += j;
//            ++j;
//        }
//        while (j<=n);

        // Output
        average = (float) sum/n;
        System.out.printf("Sum = %d\n", sum);
        System.out.printf("Average = %.2f", average);
    }
}