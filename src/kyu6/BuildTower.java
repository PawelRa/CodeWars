package kyu6;

import java.util.Arrays;

public class BuildTower {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(1)));
        System.out.println(Arrays.toString(towerBuilder(3)));
        System.out.println(Arrays.toString(towerBuilder(6)));
    }

    //    public static String[] towerBuilder(int nFloors) {
//        String mark = "*";
//        String[] result = new String[nFloors];
//        int howManyMarks = (nFloors - 1) * 2 + 1;
//        for (int i = 0; i < nFloors; i++) {
//            int spaces = (nFloors - 1 - i);
//            System.out.println(spaces);
//            result[i] = " ".repeat(spaces) + mark.repeat(i * 2 + 1) + " ".repeat(spaces);
//            if (i != nFloors - 1) {
//                result[i] += "X\n";
//            }
//        }
//        return result;
//    }
    public static String[] towerBuilder(int nFloors) {
        String mark = "*";
        String[] result = new String[1];
        result[0] = "";
        for (int i = 0; i < nFloors; i++) {
            int spaces = (nFloors - 1 - i);
            result[0] += " ".repeat(spaces) + mark.repeat(i * 2 + 1) + " ".repeat(spaces);
            if (i != nFloors - 1) {
                result[0] += ",";
            }
        }
        return result;
    }
}