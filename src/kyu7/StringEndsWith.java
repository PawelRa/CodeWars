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
        return str.endsWith(ending);
    }
}
