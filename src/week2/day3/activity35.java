/* Input integer array with n elements */

package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class activity35 {
    private static Scanner sc = new Scanner(System.in);
    private static int[] intArray;

    public static void main(String[] args) {
        System.out.print("Nhap kich thuoc mang so nguyen: ");
        int n = sc.nextInt();
        intArray = new int[n];
        System.out.println("Nhap tung phan tu cua mang: ");
        for (int i = 0; i < intArray.length; ++i) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la: " + Arrays.toString(intArray));

        //1. Tinh trung binh cong cac so le o vi tri chan
        int oddSum = 0;
        int count = 0;
        for (int i = 0; i < intArray.length; i += 2) {
            if ((intArray[i] % 2) != 0) {
                oddSum += intArray[i];
                count++;
            }
        }
        System.out.printf("1. Trung binh cong cac so le o vi tri chan cua mang la: %.2f\n", (float) oddSum / count);

        //2. Tim so lon nhat trong mang vua nhap
        int max = 0;
        for (int item : intArray) {
            if (item > max) max = item;
        }
        System.out.println("2. Phan tu co gia tri lon nhat trong mang la: " + max);

        //3. Tim vi tri cac so nho nhat trong mang
        int min = intArray[0];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < intArray.length; ++i) {
            if (intArray[i] < min) {
                min = intArray[i];
            } else if (intArray[i] == min) {
                arr.add(i);
            }
        }
        System.out.println("3. Vi tri cac so nho nhat trong mang la: ");
        for (int i = 0; i < arr.size(); ++i) {
            System.out.printf("\tVi tri %d cua mang.\n", arr.get(i));
        }

        //4. Dem cac so chinh phuong co trong mang
        //System.out.println("4. So cac so chinh phuong co trong mang la: " + squareNum);

        //5. Hien thi cac so nguyen to co trong mang
        String primeNum = "";
        int num = 0;
        for (int i = 1; i <= intArray.length; ++i) {
            int count1 = 0;
            for(num = i; num>=1; num--) {
                if (i % num == 0)
                    count1 = count1 + 1;
            }
            if (count1 == 2) primeNum = primeNum + i + " ";
        }
        System.out.println("5. Cac so nguyen to co trong mang la: " + primeNum);

        //6. Thay the cac phan tu am co trong mang bang gia tri 0
        //System.out.println("6. Mang moi sau khi thay the cac phan tu am bang gia tri 0 la: " + Arrays.toString(intArray1));

        //7. Xoa cac phan tu am co trong mang
        //System.out.println("7. Mang moi sau khi xoa cac phan tu am la: ");

        //8. Sap xep mang da nhap theo thu tu giam dan
        //System.out.println("8. Mang moi sau khi duoc sap xep giam dan la: " + Arrays.toString(intArray3));
    }
}
