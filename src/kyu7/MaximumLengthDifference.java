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
        for (String s : a1) {
            if (s.length() > maxA1) {
                maxA1 = s.length();
            }
            if (s.length() < minA1) {
                minA1 = s.length();
            }
        }
        for (String s : a2) {
            if (s.length() > maxA2) {
                maxA2 = s.length();
            }
            if (s.length() < minA2) {
                minA2 = s.length();
            }
        }
        return Math.max(maxA2 - minA1, maxA1 - minA2);
    }
}
