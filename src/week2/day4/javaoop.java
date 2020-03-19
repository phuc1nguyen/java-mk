package week2.day4;

import java.util.Scanner;
public class javaoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] studentArray = new Student[2];        //Khai bao kieu du lieu doi tuong Student cho mang
        for (int i=0; i<2; ++i) {
            System.out.println("Nhap sinh vien thu " + (i+1));
            String line = sc.nextLine();
            String[] items = line.split(",");

            studentArray[i] = new Student();        //Khai bao kieu du lieu doi tuong cho phan tu cua mang

            studentArray[i].setName(items[0]);
            studentArray[i].mssv = items[1];
            studentArray[i].birthday = items[2];
            studentArray[i].gender = items[3];
            studentArray[i].setGpa(Float.valueOf(items[4]));

            System.out.println("Thong tin sinh vien la: " + studentArray[i].toString());
        }

        System.out.println("Nhap vao MSSV can tim: ");
        String mssv = sc.nextLine();

        for (Student st : studentArray){        // Gap th nao co mssv giong minh vua nhap thi in ra
            if(st.mssv.equals(mssv)){
                System.out.println(st.toString());
                break;
            }
        }
    }
}
