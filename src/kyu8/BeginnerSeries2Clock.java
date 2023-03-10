package kyu8;

public class BeginnerSeries2Clock {
    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }
    public static int Past(int h, int m, int s)
    {
        return ((h*60*60)+(m*60)+s)*1000;
    }
}
