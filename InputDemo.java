import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        // int number;
        // System.out.println("Enter Any Number:");
        // number = input.nextInt();
        // System.out.println("Number="+number);
        // String name;
        // System.out.print("Enter your name:");
        // name = input.next();
        // System.out.println("Welcome:"+name);
        double num1;
        System.out.println("Enter the number:");
        num1 = input.nextDouble();
        System.out.println("Double Number:" + num1);

    }

}
