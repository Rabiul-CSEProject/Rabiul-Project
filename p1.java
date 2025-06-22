import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter Your Number:");
        number = input.nextInt();
        if (number > 1) {
            System.out.print("Correct");
        } else if (number < 1) {
            System.out.print("Incorrect");
        } else {
            System.out.print("Number Is Equal");
        }
    }
}
