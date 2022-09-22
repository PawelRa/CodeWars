public class BetterThanAverage {
    public static void main(String[] args) {
        System.out.println(BetterThanAverage.betterThanAverage(new int[]{2, 3}, 5));
        System.out.println(BetterThanAverage.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(BetterThanAverage.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(BetterThanAverage.betterThanAverage(new int[]{100, 90}, 1));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        int average = (Arrays.stream(classPoints).sum()+yourPoints)/(classPoints.length+1);
//        if (average > yourPoints) {
//            return false;
//        }
//        return true;

//        int classPointsSum = 0;
//        for (int classPoint : classPoints) {
//            classPointsSum += classPoint;
//        }
//        if ((classPointsSum+yourPoints)/(classPoints.length+1) < yourPoints) {
//            return true;
//        }
//        return false;

        int classPointsSum = 0;
        for (int classPoint : classPoints) {
            classPointsSum += classPoint;
        }
        return (classPointsSum + yourPoints) / (classPoints.length + 1) < yourPoints;
    }

}
