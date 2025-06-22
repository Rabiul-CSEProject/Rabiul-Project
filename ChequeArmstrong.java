import java.util.Scanner;

public class ChequeArmstrong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int sum = 0, num, r, temp;
        System.out.print("Enter Any Number:");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }
        if (num == sum) {
            System.out.print("Number is Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }

}
