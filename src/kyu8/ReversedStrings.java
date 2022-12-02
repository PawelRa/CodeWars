package kyu8;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("dlrow"));
    }

    public static String solution(String str) {
        String input = str;

        //      StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        //       input1.append(input);

        // reverse StringBuilder input1
        //      input1 = input1.reverse();

        // print reversed String
        //     System.out.println(input1);

        byte[] strAsByteArray = input.getBytes();

        byte[] result =
                new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length - i - 1];

//        System.out.println(new String(result));

        return new String(result);
    }
}
