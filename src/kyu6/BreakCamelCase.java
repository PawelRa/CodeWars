package kyu6;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));
    }

    public static String camelCase(String input) {
//        if (input.length() == 0) {
//            return "";
//        }
//        String result = String.valueOf(input.charAt(0));
//        for (int i = 1; i < input.length(); i++) {
//            if (Character.isUpperCase(input.charAt(i))) {
//                result += " ";
//            }
//            result += input.charAt(i);
//        }
//        return result;
        return input.replaceAll("([A-Z])", " $1");
    }
}
