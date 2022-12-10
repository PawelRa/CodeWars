package kyu6;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Steven"));
    }
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }
        String result;
        String end = " like this";

        if (names.length ==1){
            result = names[0] + " likes this";
        } else if (names.length == 2) {
            result = names[0] + " and " + names[1] + end;
        } else if (names.length==3) {
            result = names[0] + ", "+names[1]+ " and " + names[2] + end;
        } else {
            result = names[0] + ", "+names[1]+ " and " + (names.length-2) +" others" + end;
        }
        return result;
    }
}
