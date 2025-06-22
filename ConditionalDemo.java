import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter Two Number:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        large = (num1 > num2) ? num1 : num2;
        System.out.print("large Number =" + large);
    }

}
