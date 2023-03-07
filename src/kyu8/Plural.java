package kyu8;

public class Plural {
    public static void main(String[] args) {
        System.out.println(isPlural(10f));
    }

    public static boolean isPlural(float f) {
        return f != 1;
    }
}
