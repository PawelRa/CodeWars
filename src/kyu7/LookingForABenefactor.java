package kyu7;

import java.util.Arrays;

public class LookingForABenefactor {
    public static void main(String[] args) {
        System.out.println(newAvg(new double[] {14, 30, 5, 7, 9, 11, 15},92)); //645
        System.out.println(newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0},90)); //628
        System.out.println(newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0},2));
        System.out.println();
    }

    public static long newAvg(double[] arr, double navg)
    {
        if (navg<Arrays.stream(arr).average().getAsDouble()){
            throw new IllegalArgumentException();
        }


        return -1;
    }
}
