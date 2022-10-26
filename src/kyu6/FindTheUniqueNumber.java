package kyu6;

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0})); //1.0
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); //2.0
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(findUniq(new double[]{5, 0, 0, 0, 0}));
        System.out.println(findUniq(new double[]{1, 3, 3, 3, 3}));
    }

    public static double findUniq(double arr[]) {
        double[] temp = Arrays.stream(arr).sorted().toArray();
        if (temp[0] == temp[1]){
            return temp[temp.length-1];
        }
        return temp[0];

    }
}
