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

       
    }
}
