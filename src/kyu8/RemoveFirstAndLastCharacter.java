package kyu8;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
    }

    public static String remove(String str) {
        String[] tempArray = str.split("");
        String result = "";
        for (int i = 1; i < tempArray.length - 1; i++) {
            result += tempArray[i];
        }
        return result;
    }
}

