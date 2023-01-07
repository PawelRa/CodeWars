package kyu7;

public class CountConsonants {
    public static void main(String[] args) {
        System.out.println(getCount("aaAAaa"));
        System.out.println(getCount(""));
        System.out.println(getCount("012345_Cb"));
        System.out.println(getCount("h^$&^#$&^elLo world"));
        System.out.println(getCount("Bbbbb"));
    }

    public static int getCount(String str) {
        return str.replaceAll("(?i)[aeiou\\d\\W_]", "").length();
    }
}
