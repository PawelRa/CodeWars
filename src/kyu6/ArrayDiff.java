package kyu6;

import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{80, 19, 3, 2, 11, 12, 8, 11, 0, 4, 24, 11, 11, 15, 7, 16, 77},
                new int[]{13, 19, 10, 18, 15, 19, 2, 16, 21, 17, 18, 10, 17, 24, 10, 8, 20, 9, 16, 7, 21, 19, 9, 23, 5, 3, 11, 22, 23, 10, 11, 21, 3, 12, 23, 2})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {}, new int[] {1,2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return a;
        }
        int counter = 0;
        int resultLength = 0;
        int[] temp = new int[a.length];
        loop:
        for (int i = 0;i<a.length;i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    resultLength++;
                    continue loop;
                }
            }
            temp[counter]=a[i];
            counter++;
        }
        int[] result = new int[a.length-resultLength];
        System.arraycopy(temp, 0, result, 0, result.length);
        return result;
    }
}
