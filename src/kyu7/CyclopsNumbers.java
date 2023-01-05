package kyu7;

public class CyclopsNumbers {
    public static void main(String[] args) {
        System.out.println(cyclops(1));
        System.out.println(cyclops(5));
        System.out.println(cyclops(13));
        System.out.println(cyclops(2015));
    }
    public static boolean cyclops(long n) {
        return Long.toBinaryString(n).matches("^(1+)0\\1$");
    }
}
