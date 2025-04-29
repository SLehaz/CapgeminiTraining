import java.io.*;
class ChallengeComparison {
    public static void main(String[] args) {
        String text = "hello";
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " nanoseconds");
        String filePath = "largefile.txt";

        try {
            startTime = System.nanoTime();
            long wordCountFileReader = countWordsWithFileReader(filePath);
            endTime = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCountFileReader);
            System.out.println("Time taken by FileReader: " + (endTime - startTime) + " nanoseconds");
            startTime = System.nanoTime();
            long wordCountInputStreamReader = countWordsWithInputStreamReader(filePath);
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCountInputStreamReader);
            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) + " nanoseconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static long countWordsWithFileReader(String filePath) throws IOException {
        long wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        return wordCount;
    }
    private static long countWordsWithInputStreamReader(String filePath) throws IOException {
        long wordCount = 0;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        return wordCount;
    }
}