package week3.day5.a51;

import week3.day5.a51.models.CanBo;
import week3.day5.a51.models.CongNhan;
import week3.day5.a51.models.KySu;
import week3.day5.a51.models.NhanVien;

import java.util.LinkedList;
import java.util.Scanner;

public class Activity51 {
    private static Scanner sc = new Scanner(System.in);
    private static QLCB qlcb = new QLCB();
    private static LinkedList<CanBo> cn = new LinkedList<>();
    private static LinkedList<CanBo> ks = new LinkedList<>();
    private static LinkedList<CanBo> nv = new LinkedList<>();

    private static int n;
    private static String inputText;
    private static String name;
    private static int age;
    private static String gender;
    private static String add;
    private static int level;
    private static String major;
    private static String job;

    public static void main(String[] args) {
        action();
        sc.close();
    }

    private static void action() {
        System.out.println("\nPlease pick one of these following actions: ");
        System.out.println("1. Add new can bo.");
        System.out.println("2. Find can bo by their name.");
        System.out.println("3. Display your can bo list.");
        System.out.println("4. Quit program.");

        do {
            while (!sc.hasNextInt()) {
                System.out.print("Error. Please enter a number from 1 to 3: ");
                sc.nextLine();
            } n = sc.nextInt();
        } while (n < 1 || n > 4);

        switch (n) {
            case 1:
                addCanBo();
                action();
                break;
            case 2:
                searchByName();
                action();
                break;
            case 3:
                displayCanBoList();
                action();
                break;
            default:
                quitProgram();
                break;
        }
    }

    private static void addCanBo() {
        System.out.println("\nPlease choose can bo type:");
        System.out.println("1. Cong Nhan.");
        System.out.println("2. Ky Su.");
        System.out.println("3. Nhan Vien.");

        do {
            while (!sc.hasNextInt()) {
                System.out.print("Error. Please enter a number from 1 to 3: ");
                sc.next();
            } n = sc.nextInt();
        } while (n < 1 || n > 3);

        switch (n) {
            case 1:
                System.out.print("Nhap so cong nhan muon them thong tin: ");
                int x = sc.nextInt();
                for (int i = 0; i < x; ++i) {
                    sc.nextLine();

                    System.out.printf("\nNhap thong tin (ten, tuoi, gioi tinh, dia chi) cong nhan %d:\n", i+1);
                    inputText = sc.nextLine();
                    String[] line = inputText.split(", ");
                    CanBo congNhan = qlcb.addCanBo(line[0], Integer.valueOf(line[1]), line[2], line[3]);

                    System.out.print("Nhap cap bac cong nhan " + (i+1) + ": ");
                    level = sc.nextInt();
                    cn.add(i, new CongNhan(congNhan, level));
                    System.out.println("Da them cong nhan " + (i+1) + ".");
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Nhap so ky su muon them thong tin: ");
                int y = sc.nextInt();
                for (int i = 0; i < y; ++i) {
                    sc.nextLine();

                    System.out.println("Nhap thong tin (ten, tuoi, gioi tinh, dia chi) ky su " + (i+1) + ":");
                    inputText = sc.nextLine();
                    String[] line = inputText.split(", ");
                    CanBo kySu = qlcb.addCanBo(line[0], Integer.valueOf(line[1]), line[2], line[3]);

                    System.out.print("Nhap chuyen nganh ky su " + (i+1) + ": ");
                    major = sc.next();
                    ks.add(i, new KySu(kySu, major));
                    System.out.println("Da them ky su " + (i+1) + ".");
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Nhap so nhan vien muon them thong tin: ");
                int z = sc.nextInt();
                for (int i = 0; i < z; ++i) {
                    sc.nextLine();

                    System.out.println("Nhap thong tin (ten, tuoi, gioi tinh, dia chi) nhan vien " + (i+1) + ":");
                    inputText = sc.nextLine();
                    String[] line = inputText.split(", ");
                    CanBo nhanVien = qlcb.addCanBo(line[0], Integer.valueOf(line[1]), line[2], line[3]);

                    System.out.println("Nhap cong viec nhan vien " + (i+1) + ": ");
                    job = sc.next();
                    nv.add(i, new NhanVien(nhanVien, job));
                    System.out.println("Da them nhan vien " + (i+1) + ".");
                }
                System.out.println();
                break;
            default:
                return;
        }
    }

    private static void searchByName() {     // Chon loai can bo truoc roi moi tim theo loai
        System.out.println("\nPlease choose can bo type:");
        System.out.println("1. Cong Nhan.");
        System.out.println("2. Ky Su.");
        System.out.println("3. Nhan Vien.");

        do {
            while (!sc.hasNextInt()) {
                System.out.print("Error. Please enter a number from 1 to 3: ");
                sc.next();
            } n = sc.nextInt();
        } while (n < 1 || n > 3);
        sc.nextLine();

        switch (n) {
            case 1:
                System.out.print("Nhap ten cong nhan ban muon tim: ");
                name = sc.nextLine();
                System.out.println(qlcb.searchByName(name, cn).toString());
                break;
            case 2:
                System.out.print("Nhap ten ky su ban muon tim: ");
                name = sc.nextLine();
                System.out.println(qlcb.searchByName(name, ks).toString());
                break;
            case 3:
                System.out.print("Nhap ten nhan vien ban muon tim: ");
                name = sc.nextLine();
                System.out.println(qlcb.searchByName(name, nv).toString());
                break;
            default:
                return;
        }
    }

    private static void displayCanBoList() {      // Hien thi tat ca loai can bo tren cung 1 danh sach
        LinkedList<LinkedList<CanBo>> cb = new LinkedList<LinkedList<CanBo>>();
        cb.add(cn);
        cb.add(ks);
        cb.add(nv);
        System.out.println("Danh sach can bo: ");
        qlcb.displayCanBoList(cb);
    }

    private static void quitProgram() {       // Thoat chuong trinh
        System.out.println("Thank you!");
    }
}
