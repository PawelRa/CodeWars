package kyu8;

public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(shortcut("how are you today?"));
    }

    public static String shortcut(String input) {
        String[] tempArray = input.split("");
        String result = "";
        for (String s : tempArray) {
            if (!s.equals("a") && !s.equals("e") && !s.equals("i") && !s.equals("o") && !s.equals("u")) {
                result += s;
            }
        }
        return result;
    }
}
