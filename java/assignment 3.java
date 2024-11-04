import java.util.Scanner;

public class SentenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the sentence
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        
        // Ask for the letter
        System.out.print("Enter a Letter (A-Z): ");
        String letterInput = scanner.nextLine();
        
        // Validate the letter input
        if (letterInput.length() != 1 || !Character.isLetter(letterInput.charAt(0))) {
            System.out.println("Please enter a valid letter from A to Z.");
            return;
        }

        char letter = Character.toLowerCase(letterInput.charAt(0));
        
        // Find the first occurrence of the letter
        int index = sentence.toLowerCase().indexOf(letter);

        // Output the result
        if (index == -1) {
            System.out.println("The letter does not exist in the sentence.");
        } else {
            String result = sentence.substring(index + 1);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
