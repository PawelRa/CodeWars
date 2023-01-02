package kyu8;

public class HolidayVIIIDutyFree {
    public static void main(String[] args) {
        System.out.println(dutyFree(12, 50, 1000)); //166
        System.out.println(dutyFree(24, 35, 3000)); //357
    }

    public static int dutyFree(int normPrice, int discount, int hol) {
        double dis = (double) (normPrice * discount) / 100;
        return (int) (hol / dis);
    }
}
