package kyu7;

public class CyclopsNumbers {
    public static void main(String[] args) {
        System.out.println(cyclops(1));
        System.out.println(cyclops(5));
        System.out.println(cyclops(13));
        System.out.println(cyclops(2015));
    }
    public static boolean cyclops(long n) {
        String binaryNumber = Long.toBinaryString(n);
        System.out.println(binaryNumber);
        if (binaryNumber.length()%2 ==0 || binaryNumber.length()<3){
            return false;
        }
        String[] binaryNumberArray = binaryNumber.split("");
        if (binaryNumberArray[(binaryNumberArray.length) / 2].equals("1")) {
            return false;
        }
        System.out.println(binaryNumberArray.length/2);
        for (int i =0; i< binaryNumberArray.length;i++){
            if ((i != (binaryNumberArray.length)/2) && binaryNumberArray[i].equals("0")) {
                return false;
            }
        }
        return true;
    }
}
