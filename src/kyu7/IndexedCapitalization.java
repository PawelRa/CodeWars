package kyu7;

public class IndexedCapitalization {
    public static void main(String[] args) {
        System.out.println(capitalize("codewars", new int[]{1, 3, 5}));
    }

    public static String capitalize(String s, int[] ind) {
        String[] arrayString = s.split("");
        String result = "";
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] > arrayString.length) {
                break;
            }
            arrayString[ind[i]] = arrayString[ind[i]].toUpperCase();
        }
        for (String value : arrayString) {
            result += value;
        }
        return result;
    }
}
