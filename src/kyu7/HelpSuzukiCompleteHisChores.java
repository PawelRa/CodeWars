package kyu7;

import java.util.Arrays;

public class HelpSuzukiCompleteHisChores {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(choreAssignments(new int[]{5, 2, 1, 6, 4, 4}))); //{7, 7, 8}
        System.out.println(Arrays.toString(choreAssignments(new int[]{1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9}))); //{7, 8, 8, 10, 10, 11}
        System.out.println(Arrays.toString(choreAssignments(new int[]{5, 8, 3, 5, 3, 10, 5, 3, 10, 2, 4, 8, 7, 3, 9, 6})));//{10, 11, 11, 11, 11, 12, 12, 13}
        System.out.println(Arrays.toString(choreAssignments(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8, 8, 9})));
        System.out.println(Arrays.toString(choreAssignments(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 9, 9})));

    }

    public static int[] choreAssignments(int[] chores) {

        int students = chores.length / 2;
        int student = 0;
        int[] jobs = new int[students];
        while (students > student) {
            int max = Arrays.stream(chores).max().getAsInt();
            int min = max;
            int indexMin = 0;
            int indexMax = 0;
            for (int i = 0; i < chores.length; i++) {
                if (chores[i] < min && chores[i] > 0) {
                    min = chores[i];
                    indexMin = i;
                }
            }
            for (int i = 0; i < chores.length; i++)
                if (chores[i] == max) {
                    indexMax = i;
                    max = chores[i];
                    break;
                }
            jobs[student] = min + max;
            student++;
            chores[indexMin] = 0;
            chores[indexMax] = 0;
        }
        Arrays.sort(jobs);
        return jobs;
    }
}
