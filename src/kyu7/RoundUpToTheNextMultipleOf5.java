package kyu7;

public class RoundUpToTheNextMultipleOf5 {
    public static void main(String[] args) {
        System.out.println(roundToNext5(-5));
    }

    public static int roundToNext5(int number) {
        if (number == 0) {
            return 0;
        }
        if (number % 5 == 0) {
            return number;
        }
        for (int i = 0; i < 5; i++) {
            if ((number + i) % 5 == 0) {
                return number + i;
            }
        }
        return -1;
    }
}
