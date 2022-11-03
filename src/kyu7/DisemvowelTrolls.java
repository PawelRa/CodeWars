package kyu7;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("What are you, a communist?"));
    }
    public static String disemvowel(String str) {
//        String result = str.replace("a","")
//                .replace("A","")
//                .replace("O","")
//                .replace("o","")
//                .replace("E","")
//                .replace("e","")
//                .replace("I","")
//                .replace("i","")
//                .replace("U","")
//                .replace("u","")
//                ;
//        return result;
        return str.replaceAll("[aAeEiIoOuU]","");
    }
}
