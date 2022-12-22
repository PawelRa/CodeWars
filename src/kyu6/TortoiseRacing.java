package kyu6;

import java.util.Arrays;

public class TortoiseRacing {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(720, 850, 70)));
        System.out.println(Arrays.toString(race(80, 91, 37)));
        System.out.println(Arrays.toString(race(80, 100, 40)));
    }

    public static int[] race(int v1, int v2, int g) {
        int[] result = new int[]{-1, -1, -1};
        if (v1 >= v2) {
            return null;
        }
        double hours = (double) g / (double) (v2 - v1);
        double minutes = hours * 60;
        double seconds = hours * 60 * 60;
        result[0] = (int) Math.floor(hours);
        result[1] = (int) Math.floor(minutes - (result[0] * 60));
        result[2] = (int) Math.floor(seconds - ((result[0] * 60 * 60) + (result[1] * 60)));
        return result;
    }
}
