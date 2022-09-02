//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        int result = 0;

        for (int i = 0; i < mixed.toArray().length; i++) {
            int x = Integer.parseInt(mixed.toArray()[i].toString());
            result += x;
        }

        return result;
    }
}
