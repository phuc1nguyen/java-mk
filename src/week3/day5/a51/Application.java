package week3.day5.a51;

import week3.day5.a51.models.*;

import java.util.Scanner;

public class Application {
    private static CanBo[] congNhanArray;
    private static CanBo[] kySuArray;
    private static CanBo[] nhanVienArray;

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
                System.out.print("Chon loai can bo muon them (1-3): ");
                int type = sc.nextInt();

                if (type == 1) {
                    System.out.print("Nhap so cong nhan muon them thong tin: ");
                    int n = sc.nextInt();
                    congNhanArray = new CongNhan[n];
                    for (int j=0; j<n; ++j) {
                        System.out.printf("Nhap cong nhan thu %d:\n", j+1);
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        congNhanArray[j] = ql.addCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        System.out.println("Da them " + congNhanArray[j].toString());
                        break;
                    }
                } else if (type == 2) {
                    System.out.print("Nhap so ky su muon them thong tin: ");
                    int n = sc.nextInt();
                    kySuArray = new KySu[n];
                    for (int j=0; j<n; ++j) {
                        System.out.printf("Nhap ky su thu %d:\n", j+1);
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        kySuArray[j] = ql.addCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        System.out.println("Da them " + kySuArray[j].toString());
                        break;
                    }
                } else if (type == 3) {
                    System.out.print("Nhap so nhan vien muon them thong tin: ");
                    int n = sc.nextInt();
                    nhanVienArray = new NhanVien[n];
                    for (int j=0; j<n; ++j) {
                        System.out.printf("Nhap nhan vien thu %d:\n", j+1);
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        nhanVienArray[j] = ql.addCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        System.out.println("Da them " + nhanVienArray[j].toString());
                        break;
                    }
                } else System.out.println("Nhap sai. Chay lai chuong trinh.");
                break;

            /*case 2:     //Tim kiem theo ho ten
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon tim kiem (1-3): ");
                int type2 = sc.nextInt();

                if (type2 == 1) {

                } else if (type2 ==2) {

                } else if (type2 == 3) {

                } else System.out.println("Nhap sai. Chay lai chuong trinh.");
                break;*/

            case 3:     //Hien thi danh sach can bo
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai danh sach can bo muon hien thi (1-3): ");
                int type3 = sc.nextInt();

                if (type3 == 1) ql.displayCanBoList(congNhanArray);
                else if (type3 == 2) ql.displayCanBoList(kySuArray);
                else if (type3 == 3) ql.displayCanBoList(nhanVienArray);
                else System.out.println("Nhap sai. Chay lai chuong trinh.");
                break;

            default:
                return;
        }

        //Tim kiem can bo theo ten
        /*CanBo cb = ql.searchByName("Nguyen Tuan Phuc", congNhanArray);
        if (cb == null) {
            System.out.println("Khong tim thay can bo.");
        } else {
            System.out.println("Tim thay can bo co ten la " + cb.getName());
        }*/


    }
}
