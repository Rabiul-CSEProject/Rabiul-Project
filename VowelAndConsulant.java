import java.util.Scanner;

public class VowelAndConsulant {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ch;
            System.out.println("Enter Your Latter:");
            ch = input.next().charAt(0);
            switch (ch) {
                case 'A' -> System.out.println("Vowel");
                case 'E' -> System.out.println("Vowel");
                case 'I' -> System.out.println("Vowel");
                case 'O' -> System.out.println("Vowel");
                case 'U' -> System.out.println("Vowel");
                default -> System.out.println("Consulant");
            }
        }
    }
}
