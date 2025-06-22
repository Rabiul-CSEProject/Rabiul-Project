import java.util.Scanner;

public class CapitalSmallDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter Your Latter:");
        ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Letter is capital");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Letter is Small");
        } else {
            System.out.println("this is not letter");
        }
    }
}
