package kyu8;

public class OppositesAttract {
    public static void main(String[] args) {
        System.out.println(OppositesAttract.isLove(1, 4));
        System.out.println(OppositesAttract.isLove(2, 2));
        System.out.println(OppositesAttract.isLove(1, 1));
        System.out.println(OppositesAttract.isLove(0, 1));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 != flower2 % 2);
    }
}
