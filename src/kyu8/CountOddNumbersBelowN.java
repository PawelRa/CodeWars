package kyu8;

public class CountOddNumbersBelowN {
    public static void main(String[] args) {
        System.out.println(oddCount(15));
        System.out.println(oddCount(1018887156)); //509443578
    }

    public static int oddCount(int n) {
        return (n / 2);
    }
}
