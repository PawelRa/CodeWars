//https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java

package kyu6;

import java.util.Arrays;

public class ConsecutiveStrings {
    public static void main(String[] args) {
//        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
//        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
//        System.out.println(longestConsec(new String[]{}, 3));
//        System.out.println(longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2)); //wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck
//        System.out.println(longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
//        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3)); //ixoyx3452zzzzzzzzzzzz
//        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
//        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));

    }

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k < 1 || k > strarr.length) {
            return "";
        }
        String result = "";
        if (k == 1) {
            result = strarr[0];
            for (int i = 1; i < strarr.length; i++) {
                if (strarr[i - 1].length() < strarr[i].length()) {
                    result = strarr[i];
                }
            }
            return result;
        }
        String[] temp = new String[strarr.length - 1];
        for (int i = 0; i < strarr.length - 1; i++) {
            temp[i] = "";
            for (int j = 0 + i; j < k + i; j++) {
                temp[i] += strarr[j];
            }
        }
        for (String s : temp) {
            if (s == null) {
                continue;
            }
            if (s.length() > result.length()) {
                result = s;
            }
        }
        System.out.println(Arrays.toString(temp));
        return result;
    }
}
