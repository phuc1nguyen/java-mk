/* Input integer array with n elements */

package week2.day3;

import java.util.*;

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
        for (int i = 0; i < intArray.length; i += 2) {  //Neu toan so chan ket qua ra NaN
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
        for (int i = 0; i < intArray.length; ++i) {     //Chi thoa man khi nhap so be nhat o vi tri dau tien cua mang
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
        int count1 = 0;
        for (int i = 0; i < intArray.length; ++i) {
            double squareNum = Math.sqrt(intArray[i]);
            if (squareNum - Math.floor(squareNum) == 0) {
                count1++;
            }
        }
        System.out.println("4. So cac so chinh phuong co trong mang la: " + count1);

        //5. Hien thi cac so nguyen to co trong mang
        System.out.print("5. Cac so nguyen to co trong mang la: ");
        for (int i = 0; i < intArray.length; i++) {     //Chua loai truong hop nhap gia tri 0
            boolean isPrime = true;
            int primeNum = intArray[i];
            for (int j = 2; j < primeNum; j++) {
                if (primeNum % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(primeNum + " ");
            }
        }
        System.out.println();

        //6. Thay the cac phan tu am co trong mang bang gia tri 0
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < intArray.length; ++i) {
            if (intArray[i] < 0) arr2.add(0);
            else arr2.add(intArray[i]);
        }
        System.out.println("6. Mang moi sau khi thay the cac phan tu am bang gia tri 0 la: " + Arrays.toString(arr2.toArray()));

        //7. Xoa cac phan tu am co trong mang
        ArrayList<Integer> arr4 = new ArrayList<>();
        for (int i = 0; i < intArray.length; ++i) {
            if (intArray[i] >= 0) arr4.add(intArray[i]);
        }
        System.out.println("7. Mang moi sau khi xoa cac phan tu am la: " + Arrays.toString(arr4.toArray()));

        //8. Sap xep mang da nhap theo thu tu giam dan
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < intArray.length; ++i) arr3.add(intArray[i]);
        Collections.sort(arr3, Collections.reverseOrder());
        System.out.println("8. Mang sau khi duoc sap xep giam dan la: " + Arrays.toString(arr3.toArray()));
    }
}
