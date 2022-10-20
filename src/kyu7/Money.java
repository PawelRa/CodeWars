package kyu7;

public class Money {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
        System.out.println(calculateYears(1000, 0.01625, 0.18, 1200));
        System.out.println(calculateYears(1000, 0.05, 0.18, 1000));
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        if (principal == desired) {
            return 0;
        }
        int years = 0;
        double result = principal;

        for (int i = 0; result <= desired; i++) {
            years++;
            result += (result * interest) - (result * interest * tax);
        }
        return years;
    }

}
