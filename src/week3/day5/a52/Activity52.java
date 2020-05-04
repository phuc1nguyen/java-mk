package week3.day5.a52;

import week3.day5.a52.models.Bao;
import week3.day5.a52.models.Sach;
import week3.day5.a52.models.Tailieu;
import week3.day5.a52.models.Tapchi;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity52 {
    private static Scanner sc = new Scanner(System.in);
    private static Tailieu[] tl = new Tailieu[0];
    private static QuanLyTaiLieu qltl = new QuanLyTaiLieu();
    private static ArrayList<Tailieu> danhSachTaiLieu = new ArrayList<>();

    private static int maTaiLieu, soBanPhatHanh, soTrang, soPhatHanh, thangPhatHanh, ngayPhatHanh;
    private static String nxb, tacGia;
    private static String input = "";
    private static String[] line;

    public static void main(String[] args) {
        action();
        sc.close();
    }

    private static void action() {
        System.out.println("\n1. Them tai lieu moi.");
        System.out.println("2. Xoa tai lieu.");
        System.out.println("3. Hien thi danh sach tai lieu.");
        System.out.println("4. Tim kiem tai lieu.");
        System.out.println("5. Thoat chuong trinh.");

        int i;
        do {
            System.out.println("Lua chon hanh dong tu 1-4: ");
            while (!sc.hasNextInt()) {
                System.out.println("Nhap lai: ");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 1 || i > 5);

        switch (i) {
            case 1:
                themTaiLieu();
                action();
                break;
            case 2:
                xoaTaiLieu();
                action();
                break;
            case 3:
                hienThiTaiLieu();
                action();
                break;
            case 4:
                timKiemTaiLieu();
                action();
                break;
            case 5:
                thoatChuongTrinh();
                break;
            default:return;
        }
    }

    private static void themTaiLieu() {
        System.out.println("Co 3 loai tai lieu:");
        System.out.println("1. Sach.");
        System.out.println("2. Bao.");
        System.out.println("3. Tap chi.");

        int i;
        do {
            System.out.println("Chon loai tai lieu muon them: ");
            while (!sc.hasNextInt()) {
                System.out.println("Nhap lai: ");
                sc.next();
            } i = sc.nextInt();
        } while (i < 1 || i > 4);

        switch (i) {
            case 1:     // Them sach
                sc.nextLine();
                System.out.println("Nhap thong tin sach muon them: ");
                input = sc.nextLine();
                line = input.split(", ");

                Tailieu tl1 = qltl.themTL(Integer.valueOf(line[0]), line[1], Integer.valueOf(line[2]));
                System.out.print("Nhap ten tac gia sach: ");
                tacGia = sc.nextLine();
                System.out.print("Nhap so trang sach: ");
                soTrang = sc.nextInt();

                Sach sach = new Sach(tl1, tacGia, soTrang);
                danhSachTaiLieu.add(sach);
                System.out.println("Da them sach: " + sach.toString());
                break;

            case 2:     // Them bao
                sc.nextLine();
                System.out.println("Nhap thong tin bao muon them: ");
                input = sc.nextLine();
                line = input.split(", ");

                Tailieu tl2 = qltl.themTL(Integer.valueOf(line[0]), line[1], Integer.valueOf(line[2]));
                System.out.print("Nhap ngay phat hanh: ");
                ngayPhatHanh = sc.nextInt();

                Bao bao = new Bao(tl2, ngayPhatHanh);
                danhSachTaiLieu.add(bao);
                System.out.println("Da them bao: " + bao.toString());
                break;

            case 3:     // Them tap chi
                sc.nextLine();
                System.out.println("Nhap thong tin tap chi muon them: ");
                input = sc.nextLine();
                line = input.split(", ");

                Tailieu tl3 = qltl.themTL(Integer.valueOf(line[0]), line[1], Integer.valueOf(line[2]));
                System.out.print("Nhap so phat hanh: ");
                soPhatHanh = sc.nextInt();
                System.out.print("Nhap thang phat hanh: ");
                thangPhatHanh = sc.nextInt();

                Tapchi tapchi = new Tapchi(tl3, soPhatHanh, thangPhatHanh);
                danhSachTaiLieu.add(tapchi);
                System.out.println("Da them tap chi: " + tapchi.toString());
                break;

            default:return;
        }
    }

    private static void xoaTaiLieu() {
        System.out.print("Nhap ma tai lieu can xoa: ");
        maTaiLieu = sc.nextInt();
        qltl.xoaTaiLieu(maTaiLieu, danhSachTaiLieu);
        System.out.println("Da xoa tai lieu.");
    }

    private static void hienThiTaiLieu() {
        System.out.println("Tai lieu cua ban: ");
        qltl.hienThiTL(danhSachTaiLieu);
    }

    private static void timKiemTaiLieu() {
        System.out.print("Nhap ma tai lieu can tim: ");
        maTaiLieu = sc.nextInt();
        System.out.println("Tai lieu ung voi ma " + maTaiLieu + " la: " + qltl.timKiemTL(maTaiLieu, danhSachTaiLieu).toString());
    }

    private static void thoatChuongTrinh() {
        System.out.println("Thank you!");
    }
}
