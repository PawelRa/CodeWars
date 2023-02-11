package kyu8;

public class ReversedWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("yoda doesn't speak like this!"));
    }

    public static String reverseWords(String str) {
        String result = "";
        String[] strArray = str.split(" ");
        String[] reverseStrArray = new String[strArray.length];

        for (int i = strArray.length - 1; i >= 0; i--) {
            reverseStrArray[(strArray.length - 1) - i] = strArray[i];
        }

        for (int i = 0; i < reverseStrArray.length; i++) {
            result += reverseStrArray[i];
            if (i + 1 < reverseStrArray.length) {
                result += " ";
            }
        }
        return result;
    }
}
