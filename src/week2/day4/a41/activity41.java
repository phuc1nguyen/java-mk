/* Write program to calculate area and perimeter of a rectangle */

package week2.day4.a41;

import java.util.Scanner;
public class activity41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Nhap chieu dai hinh chu nhat: ");
        float a = sc.nextFloat();
        rec.setLength(a);
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        float b = sc.nextFloat();
        rec.setWidth(b);

        System.out.println(rec.toString());
        System.out.println("Dien tich hinh chu nhat: " + rec.chuVi(a, b));
        System.out.println("Chu vi hinh chu nhat: " + rec.dienTich(a, b));
    }
}
