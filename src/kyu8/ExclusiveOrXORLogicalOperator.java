package kyu8;

public class ExclusiveOrXORLogicalOperator {
    public static void main(String[] args) {
        System.out.println(xor(false, false));
    }
    public static boolean xor(boolean a, boolean b) {
        if (a == !b){
            return true;
        }
        return false;
    }
}
