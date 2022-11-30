package kyu6;

public class AreTheyTheSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if ((a == null && b != null) || (b == null && a != null) || a.length != b.length) {
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }
        boolean result = false;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] * a[j] == b[i]) {
                    a[j] = 0;
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
            if (i != a.length - 1) {
                result = false;
            }
        }
        return result;
    }
}
