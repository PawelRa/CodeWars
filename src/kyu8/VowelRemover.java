package kyu8;

public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(shortcut("how are you today?"));
    }

    public static String shortcut(String input) {
        String[] tempArray = input.split("");
        String result = "";
        for (int i = 0; i < tempArray.length; i++) {
            if (!tempArray[i].equals("a") && !tempArray[i].equals("e") && !tempArray[i].equals("i") && !tempArray[i].equals("o") && !tempArray[i].equals("u")) {
                result += tempArray[i];
            }
        }
        return result;
    }
}
