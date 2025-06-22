public class ArrayDimnesional {
    public static void main(String[] args) {
        int[][] number = new int[2][3];
        number[0][0] = 5;
        number[0][1] = 10;
        number[0][2] = 15;
        number[1][0] = 20;
        number[1][1] = 50;
        number[1][2] = 52;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + number[row][col]);

            }
            System.out.println();

        }

    }

}
