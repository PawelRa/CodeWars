package kyu8;

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("TTTT"));
        System.out.println(makeComplement("TAACG"));
        System.out.println(makeComplement("CATA"));
    }

    public static String makeComplement(String dna) {
        char[] temp = dna.toCharArray();
        String result = "";
        for (char c : temp) {
            if (c == 'T') {
                result += 'A';
            } else if (c == 'A') {
                result += 'T';
            } else if (c == 'G') {
                result += 'C';
            } else if (c == 'C') {
                result += 'G';
            } else {
                result += c;
            }
        }
        return result;
    }
}
