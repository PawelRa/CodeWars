package kyu6;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2)); //9
//        System.out.println(solveSuperMarketQueue(new int[]  {}, 1)); //0
//        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1)); //15
//        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3,4}, 2));
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
        }
//        =============================================
        if ((customers.length > n) && n > 1) {
            int[] temp = new int[customers.length];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            int min = temp[0];
            int max = temp[0];
            //min-max
            for (int i = 1; i < temp.length; i++) {
                if (temp[i] > max) {
                    max = temp[i];
                }
                if (temp[i] < min) {
                    min = temp[i];
                }
            }
//        =============================================


            return -1;

        }


        return result;
    }

}
