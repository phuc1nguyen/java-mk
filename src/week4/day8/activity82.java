/*Write a Java program to insert an element into the array list at the x position*/

package week4.day8;

import java.util.*;

public class activity82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> yourList = new LinkedList<>();
        yourList.add(0, "Red");
        yourList.add(1, "Green");
        yourList.add(2, "Orange");
        yourList.add(3, "White");
        yourList.add(4, "Black");
        System.out.println("Input list: " + Arrays.toString(yourList.toArray()));
        System.out.println("Input text and position: ");
        String x = sc.nextLine();
        int y = sc.nextInt();
        yourList.add(y, x.substring(0, 1).toUpperCase() + x.substring(1, x.length()));
        System.out.println(Arrays.toString(yourList.toArray()));
    }
}
