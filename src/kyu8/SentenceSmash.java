package kyu8;


public class SentenceSmash {
    public static void main(String[] args) {
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
    }
    public static String smash(String... words) {
//        String result = "";
//        for (int i=0; i < words.length; i++) {
//            if (i != words.length-1) {
//            result += words[i];
//            result += " ";
//            } else {
//            result += words[i];
//            }
//        }
        return String.join(" ", words);
    }
}
