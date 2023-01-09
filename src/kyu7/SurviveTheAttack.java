package kyu7;

import java.util.Arrays;

public class SurviveTheAttack {
    public static void main(String[] args) {
        System.out.println(block(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8})); //true
        System.out.println(block(new int[] { 2, 9, 9, 7 }, new int[] { 1, 1, 3, 8 })); //false
        System.out.println(block(new int[]{1, 3, 5, 7}, new int[]{2, 4})); //false
        System.out.println(block(new int[]{10, 10, 1, 1}, new int[]{4, 4, 7, 7})); //true
    }

    public static boolean block(int[] attackers, int[] defenders) {
        int howManyFights = defenders.length;
        int[] wins = new int[]{attackers.length - defenders.length, 0};
        if (attackers.length < defenders.length) {
            howManyFights = attackers.length;
            wins[0] = 0;
            wins[1] = defenders.length - attackers.length;
        }
        for (int i = 0; i < howManyFights; i++) {
            if (attackers[i] > defenders[i]) {
                wins[0]++;
            } else {
                wins[1]++;
            }
        }
        if (wins[0] > wins[1]) {
            return false;
        } else if (wins[1] > wins[0]) {
            return true;
        } else {
            return Arrays.stream(defenders).sum() - Arrays.stream(attackers).sum() >= 0;
        }
    }
}
