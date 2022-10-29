package kyu8;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(0, "Test"));
    }

    public static String repeatStr(final int repeat, final String string) {
        if (repeat == 0) {
            return "";
        } else {
            String result = string;
            for (int i = 1; i < repeat; i++) {
                result += string;
            }
        return result;
        }
    }
}
