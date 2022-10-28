package kyu7;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
        System.out.println(getXO("xxxXoooo"));
        System.out.println(getXO("xxx23424esdsfvxXXOOooo"));
    }

    public static boolean getXO(String str) {
        String[] temp = str.split("");
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (temp[i].equalsIgnoreCase("o")) {
                o++;
            }
            if (temp[i].equalsIgnoreCase("x")) {
                x++;
            }
        }
        return x == o;
    }
}
