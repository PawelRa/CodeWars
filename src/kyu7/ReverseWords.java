package kyu7;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
//        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("   "));
    }

    public static String reverseWords(final String original) {
        System.out.println(original);
        String result = "";
        String[] originalTemp = original.split(" ");
        System.out.println("X" + Arrays.toString(originalTemp) + "X");
        for (int i = 0; i < originalTemp.length; i++) {
            String temp = "";
            String[] tempArray = originalTemp[i].split("");
            for (int j = tempArray.length - 1; j >= 0; j--) {
                temp += tempArray[j];
            }
            result += temp;
            if (i < originalTemp.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
