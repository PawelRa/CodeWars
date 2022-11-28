package kyu6;

public class PianoKata1 {
    public static void main(String[] args) {
        System.out.println(blackOrWhiteKey(1));
        System.out.println(blackOrWhiteKey(5));
        System.out.println(blackOrWhiteKey(12));
        System.out.println(blackOrWhiteKey(42));
        System.out.println(blackOrWhiteKey(88));
        System.out.println(blackOrWhiteKey(89));
        System.out.println(blackOrWhiteKey(92));
    }
    public static String blackOrWhiteKey(int keyPressCount) {
        int result = keyPressCount % 88;
        if (result == 2 || result == 5 || result == 7 || result == 10 || result == 12 || result == 14 || result == 17
                || result == 19 || result == 22 || result == 24 || result == 26 || result == 29 || result == 31
                || result == 34 || result == 36 || result == 38 || result == 41 || result == 43 || result == 46
                || result == 48 || result == 50 || result == 53 || result == 55 || result == 58 || result == 60
                || result == 62 || result == 65 || result == 67 || result == 70 || result == 72 || result == 74
                || result == 77 || result == 79 || result == 82 || result == 84 || result == 86){
            return "black";
        }
        else{return "white";}
    }
}

