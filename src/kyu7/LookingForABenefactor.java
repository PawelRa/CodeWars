package kyu7;

import java.util.Arrays;

public class LookingForABenefactor {
    public static void main(String[] args) {
//        System.out.println(newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92)); //645
//        System.out.println(newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90)); //628
        System.out.println(newAvg(new double[]{7491.000000000001, 67744.6, 9385.2, 151764.80000000002, 35180.200000000004, 148745.30000000002, 141740.5, 84486.6, 151512.90000000002, 32943.9, 158758.6,
                39101.700000000004, 42420.4, 175929.6, 165743.6, 33169.4, 28495.500000000004, 106658.20000000001, 104296.50000000001, 106231.40000000001, 109580.90000000001, 215053.30000000002, 175565.5,
                2042.7000000000003, 214211.80000000002, 10191.5, 214198.6, 67516.90000000001, 133134.1, 44394.9, 206339.1, 3397.9, 206330.30000000002, 138091.80000000002, 166520.2, 148711.2, 160415.2,
                90612.50000000001, 216359.00000000003, 50755.100000000006, 57098.8, 125156.90000000001, 163086.0, 103061.20000000001, 134718.1, 110691.90000000001, 77787.6, 27328.4, 42544.700000000004,
                109848.20000000001, 82183.20000000001, 9674.5, 42244.4, 120440.1, 208329.00000000003, 178802.80000000002, 142754.7, 68282.5, 118251.1, 112041.6, 63054.200000000004, 71146.90000000001,
                39862.9, 175767.90000000002, 62795.700000000004, 127670.40000000001, 132035.2, 89386.0}, 114019.75441176472)); //706096
//        System.out.println(newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0}, 2));
        System.out.println();
    }

    public static long newAvg(double[] arr, double navg) {
        if (navg < Arrays.stream(arr).average().getAsDouble()) {
            throw new IllegalArgumentException();
        }
        double arrAverage = (Arrays.stream(arr).average().getAsDouble());
        double[] tempArray = new double[arr.length + 1];
        System.arraycopy(arr, 0, tempArray, 0, arr.length);
        tempArray[tempArray.length - 1] = Math.ceil(arrAverage);
        while (Arrays.stream(tempArray).average().getAsDouble() < navg) {
            tempArray[tempArray.length - 1]++;
        }
        return (long) tempArray[tempArray.length - 1];
    }
}
