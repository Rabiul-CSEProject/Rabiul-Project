import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter Your Answer Here:/n You are Java Lover or Not?");
        ch = input.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.out.print("You Are A Java Lover");
        } else if (ch == 'N' || ch == 'n') {
            System.out.print("You Are Not a Java Lover");
        } else
            System.out.print("Answer is wrong");

    }

}
