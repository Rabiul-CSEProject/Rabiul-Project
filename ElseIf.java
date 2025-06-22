import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        int number;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Any Number:");
        number = input.nextInt();
        if (number > 0) {
            System.out.print("Positive");

        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
    }

}
