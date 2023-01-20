package kyu8;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
    public static String doubleChar(String s){
        return s.replaceAll(".", "$0$0");
    }
}
