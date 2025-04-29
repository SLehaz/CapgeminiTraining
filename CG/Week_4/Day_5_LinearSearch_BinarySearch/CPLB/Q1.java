import java.util.*;
class SearchChallenge {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (
                    nums[i] > 0 &&
                            nums[i] <= n &&
                            nums[nums[i] - 1] != nums[i]
            ) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1, 7, 2, 10, 6};
        int target = 7;
        int missing = firstMissingPositive(numbers.clone());
        System.out.println("First missing positive integer: " + missing);
        int index = binarySearch(numbers.clone(), target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index (after sorting): " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}