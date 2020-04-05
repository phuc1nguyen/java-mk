package HackerRank;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> jvList = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            jvList.add(sc.nextInt());
        }

        //Perform two queries
        int q = sc.nextInt();       //Type '2' for 2 queries
        for (int i = 0; i < q; ++i) {
            sc.nextLine();
            String action = sc.nextLine();      //Type 'insert' or 'delete'
            if ((action.substring(0, 1).toUpperCase() + action.substring(1, action.length())).equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                jvList.add(x, y);
            } else if ((action.substring(0, 1).toUpperCase() + action.substring(1, action.length())).equals("Delete")) {
                int x = sc.nextInt();
                jvList.remove(x);
            }
        }

        //Print updated list
        for (int item:jvList) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
