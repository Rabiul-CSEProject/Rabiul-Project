import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter Your Number:");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.print("The Number Is Even");
        } else {
            System.out.print("The Number Is Odd");
        }
    }

}
