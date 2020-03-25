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

        int i = 0;
        do {
            System.out.print("Lua chon hanh dong 1-3: ");
            while (!sc.hasNextInt()) {
                System.out.print("Sai cu phap. Vui long nhap lai: ");
                sc.next();
            }
            i = sc.nextInt();
        } while (i<1 || i>3);

        QLCB ql = new QLCB();

        CanBo[] congNhanArray = new CongNhan[10];
        switch (i) {
            case 1:
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon them: ");
                int type = sc.nextInt();

                System.out.print("Nhap so luong can bo muon them thong tin: ");
                int n = sc.nextInt();
                if (type == 1) {
                    for (int j=0; j<n; ++j) {

                    }
                }


        }
    }
}
