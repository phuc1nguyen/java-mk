/*Thực hiện bắt hết các exception có thể cho đoạn lệnh sau*/

package week4.day7;

public class activity71 {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e);
        }

        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        try {
            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        System.out.println("Finished!");
    }
}
