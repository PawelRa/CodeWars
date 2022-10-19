package kyu7;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }

    public static int findShort(String s) {
        int result = 100;
//        String[] array = s.split(" ");
        for (String value : s.split(" ")) {
            if (value.length() < result) {
                result = value.length();
            }
        }
        return result;
    }
}
