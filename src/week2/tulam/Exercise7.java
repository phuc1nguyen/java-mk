/* Implementing the else-if Statements */

package week2.tulam;

import java.util.Scanner;
public class Exercise7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the distance: ");
        int d = sc.nextInt();
        int fee;

        if (d>=0 && d<5) fee = 2;
        else if (d>=5 && d<15) fee = 5;
        else if (d>=15 && d<25) fee = 10;
        else if (d>=25 && d<50) fee = 15;
        else fee = 20;

        System.out.printf("Distance fee is %d USD", fee);
    }
}