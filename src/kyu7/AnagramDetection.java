//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
package kyu7;

import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee")); //true
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));//true
        System.out.println(isAnagram("Twoo", "Woot")); //true
        System.out.println(isAnagram("apple", "pale")); //false
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        int stringLength = test.length();
        char[] tempTest = test.toLowerCase().toCharArray();
        char[] originalTemp = original.toLowerCase().toCharArray();
        Arrays.sort(tempTest);
        Arrays.sort(originalTemp);

        for (int i=0;i<stringLength;i++){
            if (tempTest[i]!=originalTemp[i]){
                return false;
            }
        }
        return true;
    }
}
