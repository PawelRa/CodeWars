package kyu7;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        if (word.length() == 1) {
            return word;
        }
        String[] temp = word.split("");
        int len = word.length() / 2;
        if (word.length() % 2 != 0) {
            return temp[len];
        } else {
            return temp[len - 1] + temp[len];
        }
    }
}
