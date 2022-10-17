//Is this a triangle?
//Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
//(In this case, all triangles must have surface greater than 0 to be accepted).

package kyu7;

class TriangleTester {
    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        int[] lists = new int[]{a, b, c};
        int max = lists[0];
        int maxPosition = 0;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i] > max) {
                max = lists[i];
                maxPosition = i;
            }
        }
        switch (maxPosition) {
            case 0:
                return a < b + c;
            case 1:
                return b < a + c;
            case 2:
                return c < a + b;
        }
        return false;
    }
}
