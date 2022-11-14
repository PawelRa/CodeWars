//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
package kyu6;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));    //3
//        System.out.println(persistence(4));    //0
//        System.out.println(persistence(25));    //2
//        System.out.println(persistence(999));    //4
    }
    public static int persistence(long n) {
        String tempString = String.valueOf(n);
        int result = 0;
        while (tempString.length()>1){
            int tempValue =0;
            for (int i=0;i<tempString.length();i++){
                tempValue+= tempString.charAt(i);
            }
            result++;
        }
        return result;
    }
}
