package kyu6;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        List<String> b = new ArrayList<String>();
        b.add(":)");
        b.add(":D");
        b.add("X-}");
        b.add("xo)");
        b.add(":X");
        b.add(":-3");
        b.add(":3");
        List<String> c = new ArrayList<String>();
        c.add(":)");
        c.add(":D");
        c.add(";D");
        c.add(";)");
        c.add(":-)");
        c.add(":-D");
        c.add(";-D");
        c.add(";-)");
        c.add(":~)");
        c.add(":~D");
        c.add(";~D");
        c.add(";~)");
        c.add(":)P");

        System.out.println(countSmileys(a));
        System.out.println(countSmileys(b));
        System.out.println(countSmileys(c));
    }

    public static int countSmileys(List<String> arr) {
        int sum = 0;
        for (String face : arr) {
            if (face.length() == 3) {
                if ((face.charAt(0) == ';' || face.charAt(0) == ':')
                        && (face.charAt(1) == '-' || face.charAt(1) == '~')
                        && (face.charAt(2) == ')' || face.charAt(2) == 'D')
                ) {
                    sum++;
                }
            } else if (face.length() == 2) {
                if ((face.charAt(0) == ';' || face.charAt(0) == ':')
                        && (face.charAt(1) == ')' || face.charAt(1) == 'D')
                ) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
