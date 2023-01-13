package kyu8;

public class KeepUpTheHoop {
    public static void main(String[] args) {
        System.out.println(hoopCount(11));
    }
    public static String hoopCount(int n){
        return n >= 10?"Great, now move on to tricks":"Keep at it until you get it";
    }
}
