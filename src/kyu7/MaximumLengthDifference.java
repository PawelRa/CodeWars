package kyu7;

public class MaximumLengthDifference {
    public static void main(String[] args) {
        String[] s1 = new String[]{"tttuuupaammddddb", "uudddgqqqmmmmeeexxfaaa", "fffppzy", "iiiifffrrrzzz", "jjsshvvvvkkkssttzzzzd", "li"};
        String[] s2 = new String[]{"tttjjjmmwyzzggggwf", "wwiiibbzzmm", "wwwwvvvffflpkk", "kkkrrxxxh"};
        System.out.println(mxdiflg(s1, s2)); //16
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length < 1 || a2.length < 1) {
            return -1;
        }
        int minA1 = a1[0].length();
        int maxA1 = a1[0].length();
        int minA2 = a2[0].length();
        int maxA2 = a2[0].length();
        for (int i = 1; i < a1.length; i++) {
            if (a1[i].length() > maxA1) {
                maxA1 = a1[i].length();
            }
            if (a1[i].length() < minA1) {
                minA1 = a1[i].length();
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i].length() > maxA2) {
                maxA2 = a2[i].length();
            }
            if (a2[i].length() < minA2) {
                minA2 = a2[i].length();
            }
        }
        if (maxA2 - minA1 > maxA1 - minA2) {
            return maxA2 - minA1;
        } else {
            return maxA1 - minA2;
        }
    }
}
