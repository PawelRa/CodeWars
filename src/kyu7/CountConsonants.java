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
        String[] arrayString = str.toLowerCase().split("");
        if (str.length() < 1) {
            return 0;
        }
        int result = 0;
        for (String s : arrayString) {
            if (!(s.equals("a") || s.equals("e") || s.equals("i")
                    || s.equals("o") || s.equals("u")) && Character.isLetter(s.charAt(0))) {
                result++;
            }
        }
        return result;
    }
}
