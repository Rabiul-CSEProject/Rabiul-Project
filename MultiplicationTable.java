import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter Your Initial Number:");
        m = input.nextInt();
        System.out.print("Enter Your Final Number:");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(i + "*" + j + "=" + i * j);
        }
        System.out.println("\n\n");
    }
}
