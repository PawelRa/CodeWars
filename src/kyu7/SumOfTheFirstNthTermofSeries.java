package kyu7;

import java.text.DecimalFormat;

public class SumOfTheFirstNthTermofSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(9));
        System.out.println(seriesSum(15));
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double step = 4;
        double sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += 1 / step;
            step += 3;
        }
        return df.format(1 + sum);
    }
}
