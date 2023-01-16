package kyu7;

public class HowManyArguments {
    public static void main(String[] args) {
        System.out.println(countArgs(1, 2, 3));
    }
    public static int countArgs(Object... args) {
        return args.length;
    }
}
