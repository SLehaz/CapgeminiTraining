class CountingSort {
    public static void countingSort(int[] ages) {
        int max = 18, min = 10;
        int range = max - min + 1;
        int[] count = new int[range];
        for (int age : ages) count[age - min]++;
        int idx = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) ages[idx++] = i + min;
        }
    }
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 10, 15, 13};
        countingSort(ages);
        System.out.println(java.util.Arrays.toString(ages));
    }
}