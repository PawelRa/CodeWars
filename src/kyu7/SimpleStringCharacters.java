package kyu7;

import java.util.Arrays;

public class SimpleStringCharacters {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solve("Codewars@codewars123.com")));
        System.out.println(Arrays.toString(Solve("CbgA5<1d-tOwUZTS8yQ")));
        System.out.println(Arrays.toString(Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H")));
        System.out.println(Arrays.toString(Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD")));
        System.out.println(Arrays.toString(Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe")));
    }

    public static int[] Solve(String word) {
        int[] result = new int[]{0, 0, 0, 0};
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                result[1]++;
            } else if (Character.isUpperCase(word.charAt(i))) {
                result[0]++;
            } else if (Character.isDigit(word.charAt(i))) {
                result[2]++;
            } else if (Character.isSpaceChar(word.charAt(i))) {
                continue;
            } else {
                result[3]++;
            }
        }
        return result;
    }
}
