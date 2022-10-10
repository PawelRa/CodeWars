package kyu8;//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
// Essentially, rearrange the digits to create the highest possible number.
import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(12959678));
    }

    public static int sortDesc(final int num) {
        String numString = Integer.toString(num);
        char[] chars = numString.toCharArray();
        Arrays.sort(chars);
        StringBuilder temp = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            temp.append(chars[i]);
        }
        String result = temp.toString();
        return Integer.parseInt(result);
    }
}