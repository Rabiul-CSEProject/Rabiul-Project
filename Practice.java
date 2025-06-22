import java.util.Scanner;

public class Practice {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        String title, price, description, category;
        int id;
        System.out.println("Enter The Title:");
        title = input.nextLine();
        System.out.println("Enter The Price:");
        price = input.nextLine();
        System.out.println("Enter The Description:");
        description = input.nextLine();
        System.out.println("Enter The Category:");
        category = input.nextLine();
        System.out.println("Enter The Id:");
        id = input.nextInt();

    }

}
