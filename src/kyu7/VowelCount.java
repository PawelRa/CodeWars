package kyu7;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount(""));
        System.out.println(getCount("pear tree"));
        System.out.println(getCount("o pear treea kak ushakov lil vo kashu kakao"));
        System.out.println(getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w " +
                "zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  " +
                "ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte " +
                "fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz " +
                "jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  " +
                "qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  " +
                "pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq " +
                "hoatuiq fgxt goty"));
    }

    public static int getCount(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.toLowerCase().charAt(i) == 'a') || (str.toLowerCase().charAt(i) == 'e')
                    || (str.toLowerCase().charAt(i) == 'i') || (str.toLowerCase().charAt(i) == 'o')
                    || (str.toLowerCase().charAt(i) == 'u')
            ) {
                result++;
            }
        }
        return result;
    }
}
