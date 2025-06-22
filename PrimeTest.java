import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, totalPrime = 0;
        System.out.println("Enter initial number:");
        m = input.nextInt();
        System.out.println("Enter Ending number:");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("TotalPrime:" + totalPrime);

    }
}
