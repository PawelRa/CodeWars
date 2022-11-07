package kyu7;

public class YouReASquare {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
        System.out.println(isSquare(111795217));
    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }
}
