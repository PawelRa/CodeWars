package kyu8;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
        System.out.println(areaOrPerimeter(6, 10));
    }

    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * l;
        } else {
            return 2 * l + 2 * w;
        }
    }
}
