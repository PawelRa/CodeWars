public class YesOrNo {
    public static void main(String[] args) {
        System.out.println((YesOrNo.boolToWord(true)));
        System.out.println((YesOrNo.boolToWord(false)));
    }

    public static String boolToWord(boolean b) {
//        return b == true ? "Yes" : "No";
        return b ? "Yes" : "No";
    }
}
