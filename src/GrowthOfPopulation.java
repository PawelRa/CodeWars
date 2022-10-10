public class GrowthOfPopulation {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int temp = p0;
        int years = 0;
        for (int i = 0; temp < p; i++) {
            temp += (int) ((percent / 100) * temp) + aug;
            years++;
        }


        return years;
    }
}
