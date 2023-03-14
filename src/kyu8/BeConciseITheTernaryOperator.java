package kyu8;

public class BeConciseITheTernaryOperator {
    public static void main(String[] args) {
        System.out.println(describeAge(7));
    }

    public static String describeAge(int age) {
        if (age <= 12) {
            return "You're a(n) kid";
        } else if (age >= 13 && age <= 17) {
            return "You're a(n) teenager";
        } else if (age >= 18 && age <= 64) {
            return "You're a(n) adult";
        } else {
            return "You're a(n) elderly";
        }
    }
}
