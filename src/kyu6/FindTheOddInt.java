package kyu6;

import static java.util.Arrays.stream;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5})); //5
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})); //-1
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5})); //5
        System.out.println(findIt(new int[]{10})); //10
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1})); //10
        System.out.println(findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10})); //1
    }

    public static int findIt(int[] a) {
//        if (a.length == 1) {
//            return a[0];
//        }
//        int temp = 0;
//        int result = a[0];
//        for (int j : a) {
//            result = j;
//            for (int k : a) {
//                if (k == result) {
//                    temp++;
//                }
//            }
//            if (temp % 2 != 0) {
//                return result;
//            }
//            temp = 0;
//        }
        return stream(a).reduce(0, (x, y) -> x ^ y);
    }
}
