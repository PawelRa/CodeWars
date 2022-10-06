import java.util.Arrays;

public class MaxArrayValue {
    public static void main(String[] args) {
        MaxArrayValue.secondMax(new int[]{2, 5, 6, 8, 7, 4, 2, 1, 8, 3, 9});
    }

    private static void secondMax(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(sortedArray[sortedArray.length - 2]);
    }

}
