import java.util.Scanner;

public class A3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        int id;
        @SuppressWarnings("unused")
        String title, price, description, category;
        // System.out.println("Enter Your Product Id:\nEnter Your Product Title:\nEnter
        // Your Product Description:\nEnter Your Product Price:\nEnter Your Product
        // Category:");
        // title=input.nextLine();
        // price=input.nextLine();
        // description=input.nextLine();
        // category=input.nextLine();
        // id=input.nextInt();
        System.out.print("Enter Your Product Title:");
        title = input.nextLine();
        System.out.print("Enter Your Product Price:");
        price = input.nextLine();
        System.out.print("Enter Your Product Description:");
        description = input.nextLine();
        System.out.print("Enter Your Product Category:");
        category = input.nextLine();
        System.out.print("Enter Your Product Id:");
        id = input.nextInt();
    }

}
