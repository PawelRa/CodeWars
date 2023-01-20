package kyu8;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
    public static String doubleChar(String s){
        String[] arrayChar = s.split("");
        String result = "";
        for (String value : arrayChar) {
            result += value + value;
        }
        return result;
    }
}
