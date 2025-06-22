import java.util.Scanner;

public class reverseDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num, sum = 0, temp, r;
        System.out.print("Enter Any Number:");
        num = input.nextInt(); // info: its a revarse math
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        System.out.print("The Reverse = " + sum);
    }

}