package kyu8;

public class chromosomeCheck {
    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XX"));
    }
    public static String chromosomeCheck(String sperm) {
        return sperm=="XX" ? "Congratulations! You're going to have a daughter." : "Congratulations! You're going to have a son.";
    }
}
