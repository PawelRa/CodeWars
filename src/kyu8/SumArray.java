package kyu8;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        System.out.println(SumArray.sum(new double[] {}));
        System.out.println(SumArray.sum(new double[] {-2.398}));
        System.out.println(SumArray.sum(new double[] {1.1, 2.2, 3.3}));
        System.out.println(SumArray.sum(new double[] {1, 5.2, 4, 0, -1}));
        System.out.println(SumArray.sum(new double[] {30, 89, 100, 101}));
    }
    public static double sum(double[] numbers) {
//        double result = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            result += numbers[i];
//        }
//        return result;
        return Arrays.stream(numbers).sum();
    }
}
