import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter your radius:");
        radius = input.nextDouble();
        area = 3.1416 * radius * radius;
        System.out.print("Area Of Circle Is:" + area);

    }

}
