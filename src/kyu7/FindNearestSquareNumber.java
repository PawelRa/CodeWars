package kyu7;

public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println(nearestSq(1));
        System.out.println(nearestSq(2));
        System.out.println(nearestSq(10));
        System.out.println(nearestSq(111));
        System.out.println(nearestSq(9999));
    }

    public static int nearestSq(final int n) {
        if (n == 1) {
            return 1;
        }
        double nSqrtValue = Math.sqrt(n);
        double roundValueOfN = Math.round(nSqrtValue);
        return (int) (roundValueOfN*roundValueOfN);
    }
}
