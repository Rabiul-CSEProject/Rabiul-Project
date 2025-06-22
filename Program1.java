package JavaBook;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter 1st Number:");
        a = input.nextInt();
        System.out.print("Enter The 2nd Number:");
        b = input.nextInt();
        int add = a + b;
        System.out.println("The Total Number Is:" + add);
        int sub = a - b;
        System.out.println("The Total Number Is:" + sub);
        int multi = a * b;
        System.out.println("The Total Number Is:" + multi);
        int dev = a / b;
        System.out.println("The Total Number Is:" + dev);
        int rem = a % b;
        System.out.println("The Total Number Is:" + rem);

    }

}
