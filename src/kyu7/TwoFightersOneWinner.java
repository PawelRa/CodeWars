package kyu7;

public class TwoFightersOneWinner {
    public static void main(String[] args) {
        System.out.println(declareWinner(
                new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner(
                new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(
                new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(
                new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        System.out.println(declareWinner(
                new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(declareWinner(
                new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = fighter1;
        Fighter defender = fighter2;
        String winner = "";
        if (fighter2.name == firstAttacker) {
            attacker = fighter2;
            defender = fighter1;
        }
        while (fighter1.health >0&& fighter2.health>0 ){
            defender.health -= attacker.damagePerAttack;
            if (defender.health>0){
                attacker.health -= defender.damagePerAttack;
            }
        }
        if (attacker.health<1){
            return defender.name;
        } else {
            return attacker.name;
        }
    }
}
