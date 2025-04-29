import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class WordCountExample {
    public static void main(String[] args) {
        String filePath = "your_file_path.txt";
        String targetWord = "the";
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appeared " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}