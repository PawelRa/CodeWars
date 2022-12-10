package kyu6;

public class ConsecutiveStrings {
    public static void main(String[] args) {
//        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
//        System.out.println(longestConsec(new String[] {}, 3));
//        System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
//        System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
//        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
//        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
//        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
//        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));

    }

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k < 1) {
            return "P";
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
        String[] temp = new String[k - 1];
        for (int i = 0; i < strarr.length; i++) {
            for (int j=0;j<k;j++){
                temp[i] += strarr[j];
            }
        }

        return result;
    }
}
