package kyu7;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));
        System.out.println(accum("MjtkuBovqrU"));
        System.out.println(accum("EvidjUnokmM"));
    }

    public static String accum(String s) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < counter; j++) {
                if (j == 0) {
                    result += String.valueOf(s.charAt(i)).toUpperCase();
                } else {
                    result += String.valueOf(s.charAt(i)).toLowerCase();
                }
            }
            counter++;
            if (i != s.length() - 1) {
                result += "-";
            }
        }
        return result;
    }
}
