package kyu8;

public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
        return Integer.toBinaryString(a + b);
    }

    public static void main(String[] args) {
        System.out.println(BinaryAddition.binaryAddition(1, 1));
    }


}
