package kyu8;

public class ReduceButGrow {
    public static int multiplying(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }
}