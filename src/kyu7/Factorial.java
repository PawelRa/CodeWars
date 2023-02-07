package kyu7;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int result = 1;
        if ((n < 0) || (n > 12)) {
            throw new IllegalArgumentException("Wrong value");
        }

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
