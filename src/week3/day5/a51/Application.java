package week3.day5.a51;

import week3.day5.a51.models.CanBo;
import week3.day5.a51.models.CongNhan;
import week3.day5.a51.models.KySu;
import week3.day5.a51.models.NhanVien;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Them can bo");
        System.out.println("2. Tim kiem theo ho ten");
        System.out.println("3. Hien thi danh sach");

        int i;
        do {
            System.out.print("Can bo cua ban co 3 loai: Cong nhan, Ky su, Nhan vien. \nLua chon hanh dong 1-3: ");
            while (!sc.hasNextInt()) {
                System.out.print("Sai cu phap. Vui long nhap lai: ");
                sc.next();
            }
            i = sc.nextInt();
        } while (i<1 || i>3);

        //Nhap thong tin can bo
        QLCB ql = new QLCB();

        switch (i) {
            case 1:     //Them moi can bo
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon them: ");
                int type = sc.nextInt();

                System.out.print("Nhap so luong can bo muon them thong tin: ");
                int n = sc.nextInt();
                CanBo[] congNhanArray = new CongNhan[n];
                CanBo[] kySuArray = new KySu[n];
                CanBo[] nhanVienArray = new NhanVien[n];

                if (type == 1) {
                    for (int j=0; j<n; ++j) {
                        System.out.println("Nhap cong nhan thu " + (j+1));
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        congNhanArray[j] = ql.addCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        System.out.println("Da them " + congNhanArray[j].toString());
                        break;
                    }
                } else if (type == 2) {
                    for (int j=0; j<n; ++j) {
                        System.out.println("Nhap ky su thu " + (j+1));
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        kySuArray[j] = ql.addCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        System.out.println("Da them " + kySuArray[j].toString());
                        break;
                    }
                } else if (type == 3) {
                    for (int j=0; j<n; ++j) {
                        System.out.println("Nhap nhan vien thu " + (j+1) + ":");
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                    }
                } else System.out.println("Nhap sai. Chay lai chuong trinh.");
                break;

            case 2:     //Tim kiem theo ho ten
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon them: ");
                int type = sc.nextInt();

                CanBo cb = ql.searchByName("Nguyen Tuan Phuc", congNhanArray);

            case 3:     //Hien thi danh sach can bo

            default:
        }

        //Tim kiem can bo theo ten
        CanBo cb = ql.searchByName("Nguyen Tuan Phuc", congNhanArray);
        if (cb == null) {
            System.out.println("Khong tim thay can bo.");
        } else {
            System.out.println("Tim thay can bo co ten la " + cb.getName());
        }

        //Hien thi danh sach can bo
        ql.displayCanBoList(congNhanArray);
    }
}
