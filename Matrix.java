import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonalElements = 0;
        int SumOfUpperElements = 0;
        int SumOfLowerElements = 0;

        // Input Matrix here

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();

            }

        }

        // Diagonal,upper triangle ,lower triangle add number

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];

                }
                if (row < col) {
                    SumOfUpperElements = SumOfUpperElements + A[row][col];
                }
                if (row > col) {
                    SumOfLowerElements = SumOfLowerElements + A[row][col];
                }

            }

        }
        System.out.println("Sum Of Diagonal Elements: " + SumOfDiagonalElements);
        System.out.println("Sum Of Upper Elements: " + SumOfUpperElements);
        System.out.println("Sum Of Lower Elements: " + SumOfLowerElements);

    }

}
