package kyu8;

public class AllStarCodeChallenge {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o'));
        System.out.println(strCount("Hello", 'l'));
        System.out.println(strCount("",'z'));
    }
    public static int strCount(String str, char letter) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                result++;
            }
        }
        return result;
    }
}
