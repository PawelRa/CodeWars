package kyu7;


public class AnotherCardGame {
    public static void main(String[] args) {
        System.out.println(game(new int[]{2, 5, 8, 11}, new int[]{1, 4, 7, 10}, new int[]{0, 3, 6, 9})); //true
        System.out.println(game(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{0, 9, 10, 11})); //false
    }
    public static boolean game(int[] frank, int[] sam, int[] tom)
    {
        int[][] cards = new int[][]{frank,sam,tom};
        int[] winners = new int[]{0,0,0};
        int player = -1;
        int[] actualGame = new int[]{};
        if (frank[0] == 0){
            player = 0;
        } else if (sam[0] == 0) {
            player = 1;
        }else {
            player = 2;
        }
        System.out.println("starter = " + player);
        for (int i = player; i< 10;i++){
            switch (i%3) {
                case 0:
//                    System.out.println("frank");
                    break;
                case 1:
//                    System.out.println("sam");
                    break;
                case 2:
//                    System.out.println("tom");
                    break;
            }
        }
        return true;
    }
}
