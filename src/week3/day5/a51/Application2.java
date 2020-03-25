package week3.day5.a51;

import week3.day5.a51.models.CanBo;

import java.util.Scanner;

public class Application2 {
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

        switch (i) {
            case 1: addCanBo();
                break;
            case 2: searchCanBo();
                break;
            case 3: display();
                break;
            default:
                return;
        }
}

    public static void addCanBo() {
    }

    public static void searchCanBo() {
    }

    public static void display() {
    }

}
