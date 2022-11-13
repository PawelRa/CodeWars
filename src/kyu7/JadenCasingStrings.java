package kyu7;

public class JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        String result = "";
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        result += phrase.toUpperCase().charAt(0);
        for (int i = 1; i < phrase.length(); i++) {
            if (Character.isSpaceChar(phrase.charAt(i - 1))) {
                result += phrase.toUpperCase().charAt(i);
            } else {
                result += phrase.charAt(i);
            }
        }
        return result;
    }
}


