import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double number1, number2, area;
        System.out.print("Enter Your 1st Diagonal:");
        number1 = input.nextDouble();
        System.out.print("Eneter Your 2nd Diagonal:");
        number2 = input.nextDouble();
        area = 0.5 * (number1 * number2);
        System.out.print("Rhombos Area Is:" + area);
    }
}
