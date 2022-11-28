package kyu8;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{-1, -2, -3, -4, -5})));
        System.out.println(Arrays.toString(invert(new int[]{-1, 2, -3, 4, -5})));
    }

    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * (-1);
        }
        return result;
    }
}
