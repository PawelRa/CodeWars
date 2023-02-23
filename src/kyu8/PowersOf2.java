package kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowersOf2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(39)));
    }

    public static long[] powersOfTwo(int n) {
        List<Long> tempList = new ArrayList<>();
        if (n >= 0) {
            tempList.add(1l);
        }
        long tempInt = 1;
        for (int i = 1; i <= n; i++) {
            long power = tempInt * 2;
            tempList.add(power);
            tempInt = power;
        }
        long[] result = new long[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }
}
