package LoopDemo;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.print("Enter Your First Number:");
        m = input.nextInt();
        System.out.print("Enter Your End Number:");
        n = input.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // sum=sum+i;
        // }
        // System.out.print("Sum="+sum);

        System.out.print("The Contain is :");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }

        }
        System.out.print("\n");

        System.out.print("The Sum Of These Number: " + sum);

    }

}
