//Your team is writing a fancy new text editor, and you've been tasked with implementing the line numbering.
//Write a function which takes a list of strings and returns each line prepended by the correct number.
//The numbering starts at 1. The format is n: string. Notice the colon and space in between.
package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(LineNumbering.number(Arrays.asList("a", "b", "c", "d")));
    }

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            result.add((i + 1) + ": " + lines.get(i));
        }
        return result;
    }
}