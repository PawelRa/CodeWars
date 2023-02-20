package kyu8;

public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(Liters(14.64));
    }

    public static int Liters(double time) {
        return (int) Math.floor(time / 2);
    }
}
