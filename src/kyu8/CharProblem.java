//You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
//Write a program that returns the girl's age (0-9) as an integer.
//Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old".
//The first character in the string is always a number.
package kyu8;

public class CharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
        System.out.println(howOld("9 years old"));
        System.out.println(howOld("1 years old"));
    }
    public static int howOld(final String herOld) {
        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }
}
