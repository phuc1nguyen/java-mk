/* Write program to calculate area and perimeter of a rectangle */

package week2.day4.a41;

import java.util.Scanner;
public class activity41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Nhap chieu dai hinh chu nhat: ");
        float cd = sc.nextFloat();
        rec.setChieuDai(cd);
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        float cr = sc.nextFloat();
        rec.setChieuRong(cr);

        System.out.println(rec.toString());
        System.out.println("Dien tich hinh chu nhat: " + rec.getChuVi());
        System.out.println("Chu vi hinh chu nhat: " + rec.getDienTich());
    }
}
