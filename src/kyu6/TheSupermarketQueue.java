//https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
package kyu6;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2)); //9
        System.out.println(solveSuperMarketQueue(new int[]  {}, 1)); //0
        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1)); //15
        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3,4}, 2)); //6
        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 5, 3, 3, 5, 1, 2, 3, 6, 2, 6, 3}, 6)); //10
        System.out.println(solveSuperMarketQueue(new int[]{29, 18, 6, 23, 25, 29, 24, 17, 10, 8, 8, 22, 20, 16, 13, 17, 7, 21, 7, 11, 18, 26, 25,
                1, 18, 29, 16, 26, 7, 11, 13, 20, 12, 6, 23, 3, 10, 9, 8, 5, 6, 18, 19, 26, 5, 15, 4, 15, 1, 4}, 7)); //113
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0) {
            return 0;
        }
        if (n == 1) {
            return Arrays.stream(customers).sum();
        }
        int result = 0;

        if (customers.length <= n) {
            result = customers[0];
            for (int i = 1; i < customers.length; i++) {
                if (customers[i] > result) {
                    result = customers[i];
                }
            }
            return result;
        }
        if ((customers.length > n) && n > 1) {
            int[] temp = new int[customers.length];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            int step = n;
            while (Arrays.stream(temp).sum() > 0) {
                for (int i = 0; i < n; i++) {
                    if ((step == temp.length) && (temp[i] == 0)) {
                        continue;
                    } else {
                        temp[i] -= 1;
                    }
                    if ((step < temp.length) && temp[i] == 0) {
                        temp[i] = temp[step];
                        temp[step] = 0;
                        step++;
                    }
                }
                result++;
            }
            return result;
        }
        return -1;
    }
}
