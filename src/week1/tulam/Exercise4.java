/* Reading Values from the User and Performing Operations */

package week1.tulam;

public class Exercise4 {
    public static void main(String[] args){
        System.out.println("Enter the first number:");
        int var1 = Integer.parseInt(System.console().readLine());
        System.out.println("Enter the second number:");
        int var2 = Integer.parseInt(System.console().readLine());
        System.out.printf("The product of two number is %d", (var1*var2));
    }
}
