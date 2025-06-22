import java.util.Scanner;

public class NewClass2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Title:");
        String title = input.nextLine();
        System.out.println("Enter Your Description:");
        String description = input.nextLine();
        System.out.println("Enter Your Price:");
        String price = input.nextLine();
        System.out.println("Enter Your Category:");
        String category = input.nextLine();
        System.out.print("Enter Your Id:");
        int id = input.nextInt();

    }
}
