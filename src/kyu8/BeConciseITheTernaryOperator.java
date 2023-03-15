package kyu8;

public class BeConciseITheTernaryOperator {
    public static void main(String[] args) {
        System.out.println(describeAge(7));
    }

    public static String describeAge(int age) {
        return ("You're a(n) " + (age <= 12 ? "kid" : age <= 17 ? "teenager" : age <= 64 ? "adult" : "elderly"));
    }
}
