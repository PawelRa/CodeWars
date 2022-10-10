package kyu7;

public class RegexValidatePINcode {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println("-----------------------------");
        System.out.println(validatePin("0000"));
        System.out.println("-----------------------------");
        System.out.println(validatePin("123456"));
        System.out.println("-----------------------------");
        System.out.println(validatePin("a123"));
    }

    public static boolean validatePin(String pin) {
        System.out.println(pin);
        if ((pin.length() != 4) && (pin.length() != 6)) {
            return false;
        }
        char[] temp = pin.toCharArray();
        for (int i=0; i < pin.length(); i++) {
            if (!Character.isDigit(temp[i])){
                return false;
            }
        }
        return true;
    }
}
