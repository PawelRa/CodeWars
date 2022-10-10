package kyu8;

public class CountByX {
    public static int[] counter(int x, int y) {
        int[] result = new int[y];
        for (int i = 0; i < y; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }
}
