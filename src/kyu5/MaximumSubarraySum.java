package kyu5;


import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); //6
        System.out.println(sequence(new int[]{9, -2, -5, 6, -5, 1, 23, 25, 10, 1, -13, -19, 9, 8, 18, 2, 10, -7, -18, 26, -26, -4, 19, 15, 1, 20, 23,
                -24, -25, -6, -27, -27, -22, 14, 3, 10, 0, -27, -26, -18, -23, -21, 12, 10, 29, 24, 1, 5, -4, 4, 25, 16, 12, 2, 26}));
    }

    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        boolean end = true;
        for (int j : arr) {
            if (j > 0) {
                end = false;
                break;
            }
        }
        if (end) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i <= arr.length; i++) {
            int[] subArr = Arrays.stream(arr, i, arr.length)
                    .toArray();
            int sum = Arrays.stream(subArr).sum();
            if (sum > result) {
                result = sum;
            }
            if (subArr.length == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                int[] subArr = Arrays.stream(arr, i, j)
                        .toArray();
                int sum = Arrays.stream(subArr).sum();
                if (sum > result) {
                    result = sum;
                }
                if (subArr.length == 0) {
                    break;
                }
            }
        }
        return result;
    }
}
