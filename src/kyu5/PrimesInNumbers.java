package kyu5;
//Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
//        "(p1**n1)(p2**n2)...(pk**nk)"
//        with the p(i) in increasing order and n(i) empty if n(i) is 1.
//        Example: n = 86240 should return "(2**5)(5)(7**2)(11)"


import java.util.ArrayList;
import java.util.Collections;

public class PrimesInNumbers {
    public static void main(String[] args) {
        System.out.println(factors(86240));
        System.out.println(factors(7775460)); //"(2**2)(3**3)(5)(7)(11**2)(17)"
        System.out.println(factors(3));
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
                        i = 2;
                    }
                }
            }
        }
        Collections.sort(tempList);
        int tempPower = 1;
        int tempNumber = tempList.get(0);
        for (int i = 1; i <= tempList.size(); i++) {
            if (i < tempList.size() && tempList.get(i) == tempNumber) {
                tempPower++;
            } else {
                if (tempPower == 1) {
                    result += "(" + tempNumber + ")";
                } else {
                    result += "(" + tempNumber + "**" + tempPower + ")";
                }
                if (i < tempList.size()) {
                    tempNumber = tempList.get(i);
                }
                tempPower = 1;
            }
        }
        return result;
    }
}
