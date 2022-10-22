package kyu7;

public class BuildASquare {
    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println("-------------------");
        System.out.println(generateShape(5));
        System.out.println("-------------------");
        System.out.println(generateShape(8));
    }

    public static final String generateShape(int n) {
        String result = "";
        String mark = "+";
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result += "\n";
            }
            result += mark.repeat(n);
        }
        return result;
    }
}
