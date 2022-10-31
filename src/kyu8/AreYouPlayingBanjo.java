package kyu8;

public class AreYouPlayingBanjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
    }

    public static String areYouPlayingBanjo(String name) {
//        if (String.valueOf(name.charAt(0)).toLowerCase().equals("r")) {
        if (name.toLowerCase().startsWith ("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}

