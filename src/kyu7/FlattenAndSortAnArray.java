package kyu7;

import java.util.Arrays;

public class FlattenAndSortAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
    }

    public static int[] flattenAndSort(int[][] array) {
        if (array.length == 0) {
            return new int[]{};
        }
        String tempString = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempString += array[i][j];
            }
        }
        String[] arrayTemp = tempString.split("");
        int[] result = new int[arrayTemp.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arrayTemp[i]);
        }
        Arrays.sort(result);
        return result;
    }
}
