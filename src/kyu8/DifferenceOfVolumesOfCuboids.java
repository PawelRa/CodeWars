package kyu8;

public class DifferenceOfVolumesOfCuboids {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4})); //14
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] - secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }
}
