package kyu6;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));  //0,2
        System.out.println(Arrays.toString(twoSum(new int[]{1234, 5678, 9012}, 14690)));  //1,2
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers[i] + numbers[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }

}
