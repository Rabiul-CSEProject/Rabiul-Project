import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] number = new double[5];
            double sum = 0;
            System.out.print("enter five numbers: ");
            for (int i = 0; i < 5; i++) {
                number[i] = input.nextDouble();
            }
            for (int i = 0; i < number.length; i++) {
                sum = sum + number[i];

            }
            System.out.println("The Sum Is= " + sum);

            double avg = sum / number.length;
            System.out.println("Avarage =" + avg);
            double max = number[0];
            double min = number[0];
            for (int i = 1; i < number.length; i++) {
                if (max < number[i]) {
                    max = number[i];
                }
                if (min > number[i]) {
                    min = number[i];
                }

            }
            System.out.println("Minimum is=" + min + " Maximum is " + max);
        }
    }

}
