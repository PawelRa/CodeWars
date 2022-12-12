package kyu6;

public class ConsecutiveStrings {
    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
        System.out.println(longestConsec(new String[]{}, 3));
        System.out.println(longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2)); //wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck
        System.out.println(longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3)); //ixoyx3452zzzzzzzzzzzz
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
        System.out.println(longestConsec(new String[]{"vvvxvccnneeooomm", "ztttllltttttt", "jjwwbja", "uuqquuusssm", "uzzzuuueerrrd", "ffyytt", "ooommnncccii", "pppnobbjjjmmxx", "gsssmjiii", "mmmuuiiigbb", "tttkkeq",
                "sjhv", "hppttkkkkee", "mmiit", "ffyywwhmmpp", "ggghspp", "rrhoozyyysss", "llldmmhhhrr", "zzznjxxsslnn", "iiioo", "illttaahhiii", "uhhhffnddd", "qqnvx", "fffzzteeehhhhiiqq", "yrkkbbiiv", "iiizxjjggiacc", "ddppprrplll",
                "yydyyyaxxxpp", "wwwxxqqkmmmii", "ppaezzmmbb", "hhzyywpppggqqq", "csooggww", "mrrrqqgpppgggd", "yccllaa", "wiijlllppuu", "vvuutkkk", "ppphhxxnn", "iioaakkiirrr", "nnneellkvvt", "xxuuuhhhtttdgppp", "qqfnnnrrssr",
                "wwvvkkppphpp", "kknnqqoo", "iiiaww", "cwwjjssuuuii", "fuuuegggpp", "rrvvvyyqqq", "ssxiiixxxwhh", "kknwwwpp", "ytdl", "llttdddkkkzzzssnnn", "zzzttwwtttiin", "ummx", "iisobh", "cccjjqqjss", "iiczz", "giipqqw", "aaacgb",
                "rrrdddxzzxxxgg", "dduraa", "wxxoouqqxddd", "cqqwww", "bbbddeeevrr", "wwooittnn", "ttlct", "paaagyyyrxxnn", "xxmmjyyyvvttl", "ffhhhbusssyyyooy", "feeeukkkgg", "pbblllqqqeeti", "gtttzzynzzfffjj", "vvvndyyy", "ooojjnbbbnd",
                "dwwooz", "mllzpp", "lblllyyhhhllhs", "vvvzqqtm", "dddvuull", "hhyfffiii", "jjppjjsssoc", "bqqrrrdssy", "zmu", "ffdttycc", "vvegggrrtwww", "tttjigggyq", "lrrkkssddjj", "acccgggrr", "ssvvkkk", "uhhwcc", "uuyyoovr", "fffttyyjj",
                "bfqqqyy", "qjwwwuu", "hhhddwwuukkxxx", "auuxxhhh", "gxxddooof", "uuoobbbwwccoo", "mnhhrr", "jjnnnoooss", "eebbhhvvvwwwbb", "sssvvvaaannnhiiyy", "arrkk", "iiyycc", "kttts", "ttiddssuuu", "ddyyyllt", "lldddbsgyk", "gccnyhh",
                "kkkuujjkkeeepp", "cclljjf", "ddnnnqqxxxffwwiii"}, 1));

    }

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k < 1 || k > strarr.length) {
            return "";
        }
        String result = "";
        if (k == 1) {
            result = strarr[0];
            for (int i = 1; i < strarr.length; i++) {
                if (strarr[i].length() > result.length()) {
                    result = strarr[i];
                }
            }
            return result;
        }
        String[] temp = new String[strarr.length - 1];
        for (int i = 0; i < strarr.length - 1; i++) {
            temp[i] = "";
            for (int j = i; j < k + i; j++) {
                if (j > strarr.length - 1) {
                    break;
                }
                temp[i] += strarr[j];
            }
        }
        for (String s : temp) {
            if (s == null) {
                continue;
            }
            if (s.length() > result.length()) {
                result = s;
            }
        }
        return result;
    }
}
