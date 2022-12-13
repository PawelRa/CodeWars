package kyu5;
//https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java
//Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
//        "(p1**n1)(p2**n2)...(pk**nk)"
//        with the p(i) in increasing order and n(i) empty if n(i) is 1.
//        Example: n = 86240 should return "(2**5)(5)(7**2)(11)"


import java.util.ArrayList;
import java.util.Collections;

public class PrimesInNumbers {
    public static void main(String[] args) {
        System.out.println(factors(86240));
//        System.out.println(factors(3));
    }

    public static String factors(int n) {
        String result = "";
        ArrayList<Integer> tempList = new ArrayList<>();
        while (n != 1) {
            if (n % 2 == 0) {
                tempList.add(2);
                n = n / 2;
            } else {
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        tempList.add(i);
                        n = n / i;
                    }
                }
            }
        }
        Collections.sort(tempList);
        System.out.println(tempList);
        return result;
    }
}
