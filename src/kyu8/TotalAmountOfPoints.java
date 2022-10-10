package kyu8;//if x > y: 3 points
//        if x < y: 0 point
//        if x = y: 1 point

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        System.out.println(TotalAmountOfPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
        System.out.println(TotalAmountOfPoints.points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
        System.out.println(TotalAmountOfPoints.points(new String[]
                {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}));
        System.out.println(TotalAmountOfPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"}));
    }

    public static int points(String[] games) {
        int result = 0;
        for (String a : games) {
            String[] temp = a.split(":");
            if (Integer.parseInt(temp[0]) > Integer.parseInt(temp[1])) {
                result += 3;
            } else if (Integer.parseInt(temp[0]) == Integer.parseInt(temp[1])) {
                result += 1;
            }
        }
        return result;
    }
}
