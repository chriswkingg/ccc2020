package ccc2020;

import java.util.*;

public class J2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalInfected = 0;
        int currentDay = 0;
        int peopleLimit = s.nextInt();
        int numDayZero = s.nextInt();
        int numPerDay = s.nextInt();
        totalInfected = numDayZero;
        int dayInfected = numDayZero;
        while (totalInfected <= peopleLimit) {
            currentDay++;
            if (currentDay != 0) {
                dayInfected *= numPerDay;
                totalInfected += dayInfected;
            }
        }
        System.out.println(currentDay);
    }
}
