package kyu8;

public class NthPower {
    public static void main(String[] args) {
        System.out.println(nthPower(new int[]{1, 2}, 2));
        System.out.println(nthPower(new int[]{3, 1, 2, 2}, 3));
        System.out.println(nthPower(new int[]{3, 1, 2}, 2));
    }

    public static int nthPower(int[] array, int n) {
        if (n >= array.length) {
            return -1;
        }
        return (int) Math.pow(array[n], n);
    }
}
