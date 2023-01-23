package kyu7;

import java.util.*;

public class FlattenAndSortAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}})));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}})));
    }

    public static int[] flattenAndSort(int[][] array) {
        if (array.length == 0) {
            return new int[]{};
        }
        List<Integer> arrayTemp = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTemp.add (array[i][j]);
            }
        }
        Collections.sort(arrayTemp);
        return  arrayTemp.stream().mapToInt(Integer::intValue).toArray();
    }
}
