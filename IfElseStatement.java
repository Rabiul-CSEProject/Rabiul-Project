import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int number;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Any Number:");
        number = input.nextInt();
        if (number > 0) {
            System.out.print("Positive");

        } else {
            System.out.print("Negative");
        }
    }

}
