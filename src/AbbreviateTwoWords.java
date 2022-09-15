public class AbbreviateTwoWords {
    public static void main(String[] args) {
        System.out.println(AbbreviateTwoWords.abbrevName("Sam Harris"));
        System.out.println(AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        System.out.println(AbbreviateTwoWords.abbrevName("Evan Cole"));
        System.out.println(AbbreviateTwoWords.abbrevName("P Favuzzi"));
        System.out.println(AbbreviateTwoWords.abbrevName("david mendieta"));
    }

    public static String abbrevName(String name) {
        String[] names = name.toUpperCase().split(" ");
        return names[0].charAt(0) + "." + names[1].charAt(0);
    }
}
