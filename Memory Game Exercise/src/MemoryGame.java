import java.util.Random;
import java.util.Scanner;

public class MemoryGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] generatedNumbers = new int[7];
        int[] userNumbers = new int[7];
        
        System.out.println("Try to remember the following numbers. The numbers will be shown for 4 seconds.\n");

        // Generate and display 7 random numbers from 1 to 5
        for (int i = 0; i < 7; i++) {
            generatedNumbers[i] = random.nextInt(5) + 1;
            System.out.print(generatedNumbers[i] + " ");
        }

        // Pause for 4 seconds
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // Clear the screen
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        // Ask the user to input the remembered numbers
        System.out.println("Type the numbers one by one:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Type number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        // Display the correct numbers
        System.out.println("\nThe numbers were:");
        for (int i : generatedNumbers) {
            System.out.print(i + " ");
        }

        // Display the user's numbers
        System.out.println("\n\nYour numbers were:");
        for (int i : userNumbers) {
            System.out.print(i + " ");
        }

        // Calculate and display the number of correct answers and the percentage
        int correctCount = 0;
        for (int i = 0; i < 7; i++) {
            if (generatedNumbers[i] == userNumbers[i]) {
                correctCount++;
            }
        }

        double percentage = (correctCount / 7.0) * 100;
        System.out.println("\n\nYou got " + correctCount + " out of 7 correct answers.");
        System.out.println("Percentage of correct answers: " + percentage + "%");

        scanner.close();
    }
}
