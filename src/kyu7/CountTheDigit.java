package kyu7;

public class CountTheDigit {
    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));
        System.out.println(nbDig(5750, 0));
    }

    public static int nbDig(int n, int d) {
        int result = 0;
        String[] numbersArray = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            int value = i * i;
            numbersArray[i] = Integer.toString(value);
        }
        for (String word : numbersArray
        ) {
            String[] tempValueString = word.split("");
            for (String s : tempValueString) {
                if (Integer.parseInt(s) == d) {
                    result++;
                }
            }
        }
        return result;
    }
}
