import java.util.Scanner;

public class mathSeries {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter The Last Number:");
        n = input.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            sum = sum + i * i;
            System.out.println(i + "*" + i + " ");
        }
        System.out.println("The Series:" + sum);
    }
}
