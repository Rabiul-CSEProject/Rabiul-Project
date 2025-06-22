package OOP;

public class factorialDemo {
    public static void main(String[] args) {
        int number = 5, fact = 1; // Example number to calculate factorial
        for (int i = 1; i <= number; i++) {
            fact = fact * i; // Calculate factorial
        }
        System.out.println("Factorial of " + number + " is: " + fact); // Output the result

    }

}
