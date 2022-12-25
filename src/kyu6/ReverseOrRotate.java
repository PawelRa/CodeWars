package kyu6;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrRotate {
    public static void main(String[] args) {
        System.out.println(revRot("1234", 0)); //""
        System.out.println(revRot("", 0)); //""
        System.out.println(revRot("1234", 5)); //""
        System.out.println(revRot("733049910872815764", 5)); //"330479108928157"
        System.out.println(revRot("66443875", 4)); //"4466 8753"
    }

    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng.length() < sz) {
            return "";
        }
        List<String> strngParts = new ArrayList<>();
        String result = "";
        for (int i = 0; i < strng.length(); i += sz) {
            strngParts.add(strng.substring(i, Math.min(strng.length(), i + sz)));
        }
        for (String strngPart : strngParts) {
            if (strngPart.length() < sz) {
                return result;
            }
            String[] temp = strngPart.split("");
            int value = 0;
            for (String s : temp) {
                int x = Integer.parseInt(s);
                value += x * x * x;
            }
            if (value % 2 == 0) {
                for (int k = temp.length - 1; k >= 0; k--) {
                    result += temp[k];
                }
            } else {
                for (int m = 1; m < temp.length; m++) {
                    result += temp[m];
                }
                result += temp[0];
            }
        }
        return result;
    }
}
