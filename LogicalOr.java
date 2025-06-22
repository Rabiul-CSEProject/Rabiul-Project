import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter Your Latter:");
        ch = input.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else
            System.out.println("Consulant");
    }
}
