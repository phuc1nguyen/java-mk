package QuanLySinhVien.Terminal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainApp {
    private static Scanner sc = new Scanner(System.in);
    private static int id, age;
    private static double gpa;
    private static String name, address;
    private static String input = "";

    private static StudentManager stuMag = new StudentManager();
    private static StudentDB db = new StudentDB();
    private static ArrayList<Student> stuList = new ArrayList<>();

    public static void main(String[] args) {
        action();
        sc.close();
    }

    public static void action() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
        System.out.println("---------------------------");

        int n;
        do {
            System.out.print("Please choose: ");
            while (!sc.hasNextInt()) {
                System.out.print("Please choose again: ");
                sc.next();
            } n = sc.nextInt();
        } while (n < 0 || n > 6);

        switch (n) {
            case 1:
                addStu();
                action();
                break;
            case 2:
                editById();
                action();
                break;
            case 3:
                deleteById();
                action();
                break;
            case 4:
                sortByGpa();
                action();
                break;
            case 5:
                sortByName();
                action();
                break;
            case 6:
                show();
                action();
                break;
            case 0:
                System.out.println("Thank you!");
                break;
            default:return;
        }
    }

    private static void addStu() {
        sc.nextLine();
        System.out.println("Them thong tin sinh vien: ");
        input = sc.nextLine();
        String[] line = input.split(", ");

        Student stu = new Student(Integer.valueOf(line[0]), line[1], Integer.valueOf(line[2]), line[3], Double.valueOf(line[4]));
        //stu = stuMag.addStudent(Integer.valueOf(line[0]), line[1], Integer.valueOf(line[2]), line[3], Double.valueOf(line[4]));
        stuList.add(stu);
        db.write(stuList);
        System.out.println("Added.");
    }

    private static void editById() {
        // Chua co TH nhap ko dung mssv
        System.out.print("Nhap id sinh vien can chinh sua: ");
        id = sc.nextInt();

        sc.nextLine();
        System.out.print("Ten moi: ");
        name = sc.nextLine();
        System.out.print("Tuoi moi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Dia chi moi: ");
        address = sc.nextLine();
        System.out.print("Diem moi: ");
        gpa = sc.nextDouble();
        stuMag.editById(id, name, age, address, gpa, stuList);
        db.write(stuList);
        System.out.println("Edited.");
    }

    private static void deleteById() {
        System.out.print("Nhap id sinh vien can xoa: ");
        id = sc.nextInt();
        stuMag.deleteById(id, stuList);
        db.write(stuList);
    }

    private static void sortByName() {
        Collections.sort(stuList, new SortByName());
        db.write(stuList);
    }

    private static void sortByGpa() {
        Collections.sort(stuList, new SortByGpa());
        db.write(stuList);
    }

    private static void show() {
        stuMag.showStudent(stuList);
    }
}