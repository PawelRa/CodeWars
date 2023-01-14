package kyu7;

import java.util.Arrays;

public class AddingValuesOfArraysInAShiftedWay {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addingShifted(new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 7, 7, 7, 7, 7}}, 3)));
    }

    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] result = new int[arrayOfArrays[0].length + shift];
        for (int i = 0; i < result.length; i++) {
            if (i <= shift - 1) {
                result[i] = arrayOfArrays[0][i];
            } else if (i >= arrayOfArrays[0].length) {
                result[i] = arrayOfArrays[1][i - shift];
            } else {
                result[i] = arrayOfArrays[0][i] + arrayOfArrays[1][i - shift];
            }
        }

        return result;
    }
}
