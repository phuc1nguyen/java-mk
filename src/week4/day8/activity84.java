/*Do some timing tests to see difference between ArrayList and LinkedList for accessing the middle element*/

package week4.day8;

import java.util.*;

public class activity84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; ++i) {
            arrayList.add(i);
            linkedList.add(i);
        }
        int x;
        int y;
        do {
            System.out.println("Input 2 integers as accessing range: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (x > y);

        //Accessing arraylist
        double start = System.nanoTime();
        for (int i = x; i < y; ++i) {
            arrayList.get(i);
            //System.out.println(arrayList.get(i) + " ");
        }
        double finish = System.nanoTime();
        double delta1 = finish-start;
        System.out.println();

        //Accessing linkedlist
        double start2 = System.nanoTime();
        for (int i = x; i < y; ++i) {
            linkedList.get(i);
            //System.out.println(linkedList.get(i) + " ");
        }
        double finish2 = System.nanoTime();
        double delta2 = finish2-start2;
        System.out.println();

        //Thoi gian truy cap cac phan tu giua list
        System.out.println("Thoi gian arraylist la " + delta1 + " ns");
        System.out.println("Thoi gian linkedlist la " + delta2 + " ns");
    }
}
