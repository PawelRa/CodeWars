package kyu5;


import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); //6
    }

    public static int sequence(int[] arr) {
        if (Arrays.stream(arr).sum() < 0 || arr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr).sum();
    }
}
