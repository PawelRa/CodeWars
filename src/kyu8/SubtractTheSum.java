//https://www.codewars.com/kata/56c5847f27be2c3db20009c3/train/java

package kyu8;

public class SubtractTheSum {
    public static void main(String[] args) {
        System.out.println(subtractSum(10));
    }

    public static String subtractSum(int n) {
        String[] fruits = new String[]{"", "kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple", "cucumberpineapple",
                "cucumber", "orange", "grape", "orange",
                "grape", "apple", "grape", "cherry", "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon", "pineapple", "melon", "pineapple",
                "cucumber", "orange", "apple", "orange", "grape", "orange",
                "grape", "cherry", "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana", "melon", "pineapple", "melon", "apple", "cucumber",
                "pineapple", "cucumber", "orange", "cucumber", "orange", "grape", "cherry", "apple", "cherry", "pear", "cherry", "pear", "kiwi", "pear", "kiwi", "banana", "apple",
                "banana", "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber", "apple", "grape", "orange", "grape", "cherry", "grape", "cherry", "pear",
                "cherry", "apple", "kiwi", "banana", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple"};
        System.out.println(fruits[10]);
        String result = "apple";
        return result;
    }
}
