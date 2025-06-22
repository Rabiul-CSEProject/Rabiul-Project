import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // double celcius,fahrenheit;//Celcius to fahrenheit
            // System.out.print("Enter Your Celcius Number:");
            // celcius=input.nextDouble();
            // fahrenheit=(celcius+32)*9/5;
            // System.out.print("The Number Of fahrenheit="+fahrenheit);
            // double celcius,fahrenheit;
            double celcius, fahrenheit;
            System.out.print("Enter Your Fahrenheit Number:");// fahrenheit to celcius
            fahrenheit = input.nextDouble();
            celcius = (fahrenheit - 32) * 5 / 9;
            System.out.print("The Number Of Celcius=" + celcius);
        }

    }

}
