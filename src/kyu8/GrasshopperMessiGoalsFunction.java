package kyu8;

public class GrasshopperMessiGoalsFunction {
    public static void main(String[] args) {
        System.out.println(goals(43, 10, 5));
    }
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
