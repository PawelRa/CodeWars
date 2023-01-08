package kyu5;

public class StringIncrementer {
    public static void main(String[] args) {
        System.out.println(incrementString("foobar000"));
        System.out.println(incrementString("foo19"));
        System.out.println(incrementString(""));
        System.out.println(incrementString("foobar99"));
        System.out.println(incrementString("VhyzMK0kR"));
        System.out.println(incrementString("fo99obar99"));
        System.out.println(incrementString("?^@-"));
    }

    public static String incrementString(String str) {
        if (str.length() < 1) {
            return "1";
        }
        String[] tempString = str.split("");
        if (!(Character.isDigit(tempString[str.length() - 1].charAt(0)))) {
            return str + "1";
        }
        int add = 0;
        for (int i = tempString.length - 1; i >= 0; i--) {
            if (Character.isDigit(tempString[i].charAt(0))) {
                int tempValue = Integer.parseInt(tempString[i]) + 1;
                if (tempValue < 10) {
                    tempString[i] = String.valueOf(tempValue);
                    add = 0;
                    break;
                } else {
                    tempString[i] = "0";
                    add = 1;
                }
            }
            if (i == 0 && add == 1) {
                add = 0;
                tempString[i] = "10";
            }
            if (!(Character.isDigit(tempString[i].charAt(0))) && add == 1) {
                add = 0;
                tempString[i] = tempString[i] + 1;
            }
            if (!(Character.isDigit(tempString[i].charAt(0))) && add == 0) {
                break;
            }
        }
        String result = "";
        for (int i = 0; i < tempString.length; i++) {
            result += tempString[i];
        }
        return result;
    }
}
