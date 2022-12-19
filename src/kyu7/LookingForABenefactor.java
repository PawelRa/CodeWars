package kyu7;

import java.util.Arrays;

public class LookingForABenefactor {
    public static void main(String[] args) {
        System.out.println(newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92)); //645
        System.out.println(newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90)); //628
        System.out.println(newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0},2));
        System.out.println();
    }

    public static long newAvg(double[] arr, double navg) {
        if (navg < Arrays.stream(arr).average().getAsDouble()) {
            throw new IllegalArgumentException();
        }
        double arrAverage = (Arrays.stream(arr).average().getAsDouble()* arr.length-1);
        double[] tempArray = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        tempArray[tempArray.length - 1] = Math.ceil(arrAverage);
        while (Arrays.stream(tempArray).average().getAsDouble() < navg) {
            tempArray[tempArray.length - 1]++;
        }
        return (long) tempArray[tempArray.length - 1];
    }
}
