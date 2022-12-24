package kyu6;

import java.util.Arrays;

public class ReverseOrRotate {
    public static void main(String[] args) {
//        System.out.println(revRot("1234", 0)); //""
//        System.out.println(revRot("", 0)); //""
//        System.out.println(revRot("1234", 5)); //""
        System.out.println(revRot("733049910872815764", 5)); //"330479108928157"
    }

    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng.length() < sz) {
            return "";
        }
        String[] strngArray = strng.split("");
        System.out.println(Arrays.toString(strngArray));
        String result = "";
        String temp = "";
        for (int i = 0; i < strng.length(); i++) {
            temp += strngArray[i];
            if (temp.length() == sz) {
                int testNumber = 0;
                String[] tempArray = temp.split("");
                for (int j = 0; j < tempArray.length; j++) {
                    int x = Integer.parseInt(tempArray[j]);
                    testNumber += x * x;
                }
                if (testNumber % 2 == 0) {
                    System.out.println("reverse");
                }

                result += temp;
                temp = "";
            }
            System.out.println("------------");
        }
        return result;
    }
}
