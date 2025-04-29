class SentenceSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
                "The sky is blue.",
                "Today is a sunny day.",
                "I love programming.",
                "Java is a versatile language."
        };
        String targetWord = "sunny";

        String result = findSentenceWithWord(sentences, targetWord);
        System.out.println("Result: " + result);
    }
}