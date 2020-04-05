/*https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true*/

package HackerRank;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex {
    String pattern;
}
