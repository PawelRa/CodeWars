package kyu7;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSum(0, 1));
        System.out.println(getSum(-17, -17));
        System.out.println(getSum(-1, 2));
    }

    public static int getSum(int a, int b) {
        int min;
        int max;
        int result = 0;
        if (b > a) {
            min = a;
            max = b;
        } else if (b < a) {
            min = b;
            max = a;
        } else {
            return a;
        }
        for (int i = min; i <= max; i++) {
            result += i;
        }

        return result;
    }
}
