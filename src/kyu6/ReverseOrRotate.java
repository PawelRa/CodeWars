package kyu6;

import java.util.Arrays;

public class ReverseOrRotate {
    public static void main(String[] args) {
//        System.out.println(revRot("1234", 0)); //""
//        System.out.println(revRot("", 0)); //""
//        System.out.println(revRot("1234", 5)); //""
//        System.out.println(revRot("733049910872815764", 5)); //"330479108928157"
        System.out.println(revRot("66443875", 4)); //"4466 8753"
    }

    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng.length() < sz) {
            return "";
        }
        String[] strngArray = strng.split("");
        String result = "";
        String temp = "";
        for (int i = 0; i < strng.length(); i++) {
            temp += strngArray[i];
            if (temp.length() == sz) {
                int testNumber = 0;
                String[] tempArray = temp.split("");
                for (int j = 0; j < tempArray.length; j++) {
                    int x = Integer.parseInt(tempArray[j]);
                    testNumber += x * x *x;
                }
                if (testNumber % 2 == 0) {
                    for (int reverseArray = tempArray.length-1;reverseArray>=0;reverseArray--){
                        result += tempArray[reverseArray];
                    }
                } else {
                        System.out.println("przesuniecie");
                }
                temp = "";
                result += " ";
            }
        }
        return result;
    }
}
