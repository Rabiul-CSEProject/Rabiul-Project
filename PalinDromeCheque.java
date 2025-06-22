import java.util.Scanner;

public class PalinDromeCheque {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int m, n, i, r, temp, count = 0, sum = 0;
        System.out.print("Enter a initial Number:");
        m = input.nextInt();
        System.out.print("Enter a final number:");
        n = input.nextInt();
        System.out.println("Palindrome Number are:");
        for (i = m; i <= n; i++) {

            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.print(" " + i);
                count++;
            }

            sum = 0;
        }
        System.out.println();
        System.out.println("Total palindrome number from " + m + " to " + n + " is: " + count);

    }
}
