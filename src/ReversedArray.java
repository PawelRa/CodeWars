import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ReversedArray.digitize(123456789)));
    }
    public static int[] digitize(long n) {
        String temp = Long.toString(n);
        int[] result = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 1 - i)));
        }
        return result;
    }

}
