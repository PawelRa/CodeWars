package kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{ 6, 2, 1, 8, 10}));
    }

    public static int sum(int[] numbers) {
        if (numbers==null||numbers.length<2){
            return 0;
        } else {
            return Arrays.stream(numbers).sum()-Arrays.stream(numbers).min().getAsInt()-Arrays.stream(numbers).max().getAsInt();
        }

    }

}
