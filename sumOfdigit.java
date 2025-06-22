
import java.util.Scanner;

public class sumOfdigit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int sum = 0, num, temp, r;
        System.out.println("Enter any number:");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }
        System.out.println("Sum of Digit:" + sum);
    }

}
