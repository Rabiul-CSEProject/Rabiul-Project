package JavaBook;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 1st Number:");
        a = input.nextInt();
        System.out.print("Enter the 2nd Number:");
        b = input.nextInt();
        System.out.print("Enter the 3rd Number:");
        c = input.nextInt();
        int avarage = (a + b + c) / 3;
        System.out.print("Avarage Below:" + avarage);
    }

}
