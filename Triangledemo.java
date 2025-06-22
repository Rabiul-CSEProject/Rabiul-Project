import java.util.Scanner;

public class Triangledemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter your base:");
        base = input.nextDouble();

        System.out.print("Enter your height:");
        height = input.nextDouble();
        area = 0.5 * base * height;
        System.out.print("Area Of Triangle:" + area);
    }

}