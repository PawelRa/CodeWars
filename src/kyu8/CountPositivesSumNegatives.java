package kyu8;//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
// 0 is neither positive nor negative.

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountPositivesSumNegatives.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(CountPositivesSumNegatives.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(CountPositivesSumNegatives.countPositivesSumNegatives(new int[0])));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[]{0, 0};
        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                result[0] += 1;
            } else {
                result[1] += input[i];
            }
        }
        return result; //return an array with count of positives and sum of negatives
    }

}
