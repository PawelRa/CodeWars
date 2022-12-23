package kyu6;

import java.util.Arrays;

public class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{2, 6, 3}, 1)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 0)));
    }

    public static double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[]{};
        }
        if (n <= 3) {
            switch (n) {
                case 1:
                    return new double[]{s[0]};
                case 2:
                    return new double[]{s[0], s[1]};
                case 3:
                    return new double[]{s[0], s[1], s[2]};

            }
        }
        double[] result = new double[n];
        result[0] = s[0];
        result[1] = s[1];
        result[2] = s[2];


        for (int i = 3; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;
    }
}
