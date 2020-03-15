/*
    Nhap ban phim 2 so thuc a, b
    Nhap ban phim 1 toan tu (+, -, *, /)
    In len man hinh ket qua bieu thuc tuong ung
    Chuong trinh lap lai den khi an phim T hoac t
 */

package week2.tulam;

import java.util.Arrays;
import java.util.Scanner;
public class draft2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";

        do {
            System.out.print("Nhap so thuc thu nhat: ");
            float a = sc.nextFloat();
            System.out.print("Nhap so thuc thu hai: ");
            float b = sc.nextFloat();
            System.out.print("Nhap vao ban phim 1 trong 4 toan tu (+, -, *, /) hoac nhap (T, t) de ket thuc chuong trinh: ");
            s = sc.nextLine();
            if (s.equals("+")) System.out.println("a + b = " + (a+b));
            else if (s.equals("-")) System.out.println("a - b = " + (a-b));
            else if (s.equals("*")) System.out.println("a x b = " + (a*b));
            else if (s.equals("/")) System.out.println("a : b = " + (a/b));
            System.out.print("Tiep tuc nhap de chay chuong trinh.");
//            System.out.println("Ket thuc chuong trinh: ");
        } while (!s.toLowerCase().equals("t"));

        // In ra ket qua
        // Tiep tuc nhap toan tu
        //

        }
}