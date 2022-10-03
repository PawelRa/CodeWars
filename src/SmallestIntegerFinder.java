public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < result) {
                result = args[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43, 2}));
    }
}