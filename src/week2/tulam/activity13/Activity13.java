/* Writing a Calculator Class */

package week2.tulam.activity13;

import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("4 + 4 = " + new Calculator(4,4, "+").operate());
        System.out.println("123 : 25 = " + new Calculator(123, 25, "/").operate());
        System.out.println("1241 x 9955.44 = " + new Calculator(1241, 9955.44, "*").operate());
    }
}
