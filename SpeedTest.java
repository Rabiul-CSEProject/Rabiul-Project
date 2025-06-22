package JavaBook;

import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args) {
        // Sample sentence for the user to type
        String sampleText = "The quick brown fox jumps over the lazy dog.";

        // Display instructions
        System.out.println("Typing Speed Test!");
        System.out.println("Type the following sentence as quickly and accurately as possible:");
        System.out.println("\"" + sampleText + "\"");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter when ready...");
        scanner.nextLine(); // Wait for the user to press Enter

        System.out.println("Start typing:");
        long startTime = System.currentTimeMillis(); // Start time
        String userInput = scanner.nextLine(); // User's typing
        long endTime = System.currentTimeMillis(); // End time

        // Calculate results
        long timeTaken = endTime - startTime; // Time in milliseconds
        double timeInSeconds = timeTaken / 1000.0; // Time in seconds
        int correctCharacters = calculateAccuracy(sampleText, userInput);

        // Results
        System.out.println("\nTyping Test Results:");
        System.out.println("Time taken: " + timeInSeconds + " seconds");
        System.out.println("Words per minute (WPM): " + calculateWPM(userInput.length(), timeInSeconds));
        System.out.println("Accuracy: " + (correctCharacters * 100 / sampleText.length()) + "%");

        scanner.close();
    }

    // Function to calculate Words Per Minute (WPM)
    private static int calculateWPM(int charactersTyped, double timeInSeconds) {
        int words = charactersTyped / 5; // Average word is 5 characters
        return (int) ((words / timeInSeconds) * 60);
    }

    // Function to calculate the number of correct characters
    private static int calculateAccuracy(String sampleText, String userInput) {
        int correct = 0;
        for (int i = 0; i < Math.min(sampleText.length(), userInput.length()); i++) {
            if (sampleText.charAt(i) == userInput.charAt(i)) {
                correct++;
            }
        }
        return correct;
    }
}
