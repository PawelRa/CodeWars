package kyu8;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
        System.out.println(areaOrPerimeter(6, 10));
    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : 2 * (l + w);
    }
}
