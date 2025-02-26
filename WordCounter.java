import java.util.Scanner;

public class WordCounter {
    
    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine().trim(); // Read and trim the input
    }
    
    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the input is empty
        }
        String[] words = sentence.split("\\s+"); // Split by spaces (handles multiple spaces)
        return words.length;
    }
    
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words."); // Display result
    }
}
