package kyu8;

public class DifferenceOfVolumesOfCuboids {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4})); //14
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int aCuboid = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int bCuboid = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        return (aCuboid > bCuboid) ? aCuboid - bCuboid : bCuboid - aCuboid;
    }
}
