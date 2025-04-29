import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "user_input.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filePath, true)) {
            String userInput;
            System.out.println("Enter text to be written to the file. Type 'exit' to stop:");

            while (true) {
                userInput = reader.readLine();
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }
                writer.write(userInput + System.lineSeparator());
            }

            System.out.println("User input has been saved to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing: " + e.getMessage());
        }
    }
}