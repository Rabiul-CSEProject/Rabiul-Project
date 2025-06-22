import java.util.Arrays;

public class ArrayDemox {
    public static void main(String[] args) {
        int[] number = { 10, -2, 3, 5, 7, 8 };
        Arrays.sort(number); // sort process of data
        System.out.print("Ascending : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();

        System.out.print("Descending : ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + number[i]);

        }
        System.out.println();

        String[] names = { "Nabil", "Hanif", "Hanifa", "Nabila" };
        Arrays.sort(names);
        System.out.print("Ascending: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + names[i]);

        }
        System.out.println();

        System.out.print("Descending: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(" " + names[i]);

        }
    }

}
