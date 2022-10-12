package kyu8;

public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{}));
    }
    public static int sum(int[] arr){
        int result = 0;
        for (int j : arr) {
            if (j > 0) {
                result += j;
            }
        }
        return result;
    }
}
