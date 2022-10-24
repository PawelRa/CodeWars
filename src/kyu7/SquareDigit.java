package kyu7;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(new SquareDigit().squareDigits(0));
        System.out.println(new SquareDigit().squareDigits(9119));
    }

    public int squareDigits(int n) {
//        String test = Integer.toString(n);
        String test = String.valueOf(n);
        String result = "";
        for (int i = 0; i < test.length(); i++) {
            int number = Character.getNumericValue(test.charAt(i));
            result += Integer.toString(number * number);
        }
        return Integer.parseInt(result);
    }
}
