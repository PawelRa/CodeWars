package kyu8;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));
        System.out.println(century(89));
    }
    public static int century(int number) {
        int mod = 1;
        if (number%100==0){
            mod = 0;
        }
        return (number/100)+mod;
    }
}
