package week3.day5.a51;

import week3.day5.a51.models.CanBo;
import week3.day5.a51.models.CongNhan;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Them can bo");
        System.out.println("2. Tim kiem theo ho ten");
        System.out.println("3. Hien thi danh sach");


        QLCB ql = new QLCB();
        CanBo[] congNhanArray = new CongNhan[10];

        int i = 0;
        switch (i) {
            case 1:
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon them: ");

        }
    }
}
