package kyu8;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));
    }

    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
