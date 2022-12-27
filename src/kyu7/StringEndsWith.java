package kyu7;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("ninja", "ja"));
        System.out.println(solution("ails", "fails"));
        System.out.println(solution("abc", "abc"));
    }

    public static boolean solution(String str, String ending) {
        String[] arrayStr = str.split("");
        String[] arrayEnding = ending.split("");
        for (int i = 0; i < ending.length(); i++) {
            if (i > arrayStr.length - 1) {
                return false;
            }
            if (!arrayEnding[ending.length() - 1 - i].equals(arrayStr[str.length() - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}
