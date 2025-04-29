class SelectionSort {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[i]; scores[i] = scores[minIdx]; scores[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {78, 92, 45, 88, 60};
        selectionSort(scores);
        System.out.println(java.util.Arrays.toString(scores));
    }
}