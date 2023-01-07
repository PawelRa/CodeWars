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
        for (int i = 0; i < arrayString.length; i++) {
            if (!(arrayString[i].equals("a") || arrayString[i].equals("e") || arrayString[i].equals("i")
                    || arrayString[i].equals("o") || arrayString[i].equals("u")) && Character.isLetter(arrayString[i].charAt(0))) {
                result++;
            }
        }
        return result;
    }
}
