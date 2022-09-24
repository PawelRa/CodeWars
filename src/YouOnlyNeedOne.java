public class YouOnlyNeedOne {
    public static void main(String[] args) {
        System.out.println(YouOnlyNeedOne.check(new Object[] {1,23,5,8}, 8));
    }

    public static boolean check(Object[] a, Object x) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x) {
        for (Object o : a) {
            if (o == x) {
                return true;
            }
        }
        return false;
    }

}
