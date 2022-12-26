package kyu8;

import java.util.Arrays;

public class CatYearsDogYears {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{1, 15, 15};
        } else if (humanYears == 2) {
            return new int[]{2, 24, 24};
        } else {
            return new int[]{humanYears, 24 + (4 * (humanYears - 2)), 24 + (5 * (humanYears - 2))};
        }
    }
}
