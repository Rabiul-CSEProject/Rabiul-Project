import java.util.Scanner;

public class A5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age:");
        age = input.nextInt();
        if (age >= 18) {
            System.out.print("Valid");
        } else
            System.out.println("Invalid");
    }

}
