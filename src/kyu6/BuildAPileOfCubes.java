package kyu6;

public class BuildAPileOfCubes {
    public static void main(String[] args) {
        System.out.println(findNb(1071225)); //45
        System.out.println(findNb(4183059834009L)); //2022
//        System.out.println(findNb(24723578342962L)); //-1
        System.out.println(findNb(135440716410000L)); //4824
        System.out.println(findNb(40539911473216L));  //3568
        System.out.println(findNb(2304422822859502500L));  //55100
    }

    public static long findNb(long m) {
        long volume = 0;
        long result = 0;
        for (long i = 0; volume <= m; i++) {
            volume += Math.pow(i, 3);
            result = i;
        }
        return result-1;
    }
}
