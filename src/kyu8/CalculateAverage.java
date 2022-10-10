package kyu8;//Write a function which calculates the average of the numbers in a given list.
//Note: Empty arrays should return 0.


//import java.util.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        System.out.println(CalculateAverage.find_average(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(CalculateAverage.find_average(new int[]{}));
    }

    public static double find_average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        double result = 0.0;
        for (int number : array) {
            result += number;
        }
        return result / array.length;
//        result = Arrays.stream(array).sum()/array.length;
    }

}
