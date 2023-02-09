package kyu8;

public class GrasshopperCheckForFactor {
    public static void main(String[] args) {
        System.out.println(checkForFactor(10,2));
    }
    public static boolean checkForFactor(int base, int factor) {
        return base%factor==0;
    }
}
