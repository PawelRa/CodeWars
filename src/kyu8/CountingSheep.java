package kyu8;

import java.util.Arrays;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(countSheeps(array1));

    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        System.out.println(Arrays.toString(arrayOfSheeps));
        int result = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null && arrayOfSheep) {
                result++;
            }
        }
        return result;
    }
}
