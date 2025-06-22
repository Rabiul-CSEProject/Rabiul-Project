import java.util.Scanner;

public class palindromeDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int sum = 0, num, r, temp;
        System.out.print("Enter Any Number:");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }

}
