import java.util.Scanner;

public class NewCircle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("The Radius Is:");
        radius = input.nextDouble();
        area = 3.1416 * radius * radius;
        System.out.println("The Area Of Circle Is:" + area);

    }

}
