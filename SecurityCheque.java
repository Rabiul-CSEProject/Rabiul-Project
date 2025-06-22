import java.util.Scanner;

public class SecurityCheque {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int pass;
        String user;
        int count = 0;
        while (count == 0) {
            System.out.println("Enter Your User Id: ");
            user = input.nextLine();
            System.out.println("Enter Your Password: ");
            pass = input.nextInt();
            if (user == "Rabiul Islam" && pass == 123456) {
                System.out.println("Welcome to my Arena");
                break;
            } else {
                System.out.println("Sorry, please try again later");
                System.out.println();
            }
        }
    }
}