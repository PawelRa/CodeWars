package kyu8;

public class GrassHopperGradeBook {
    public static void main(String[] args) {
        System.out.println(getGrade(70, 70, 70));
        System.out.println(getGrade(82, 85, 87));
        System.out.println(getGrade(66, 62, 68));
    }

    public static char getGrade(int s1, int s2, int s3) {
        if ((s1 + s2 + s3) / 3 >= 90) {
            return 'A';
        } else if ((s1 + s2 + s3) / 3 >= 80) {
            return 'B';
        } else if ((s1 + s2 + s3) / 3 >= 70) {
            return 'C';
        } else if ((s1 + s2 + s3) / 3 >= 60) {
            return 'D';
        } else
            return 'F';
    }
}
