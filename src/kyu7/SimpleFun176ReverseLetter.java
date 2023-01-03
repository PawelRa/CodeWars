package kyu7;

public class SimpleFun176ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseLetter("nahsi2rk"));
    }

    public static String reverseLetter(final String str) {
        String result = "";
        String[] temp = str.split("");
        for (int i = temp.length-1;i>=0;i--){
            if (Character.isLetter(temp[i].charAt(0))){
                result += temp[i];
            }
        }
        return result;
    }
}
