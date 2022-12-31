package kyu8;

public class HowOldWillIBeIn2099 {
    public static void main(String[] args) {
        System.out.println(CalculateAge(2012, 2016));
        System.out.println(CalculateAge(2000, 1990));
        System.out.println(CalculateAge(3400, 3400));
    }

    public static String CalculateAge(int birth, int yearTo) {
        int age = yearTo - birth;
        if (age > 1) {
            return  "You are " + age + " years old.";
        } else if (age == 0) {
            return "You were born this very year!";
        } else if (age == 1) {
            return "You are " + age + " year old.";
        } else if (age == -1) {
            return "You will be born in " + age * (-1) + " year.";
        } else {
            return "You will be born in " + age * (-1) + " years.";
        }
    }
}
