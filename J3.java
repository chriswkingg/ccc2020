package ccc2020;
import java.util.*;

public class J3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numPoints = s.nextInt();
        int[] xPoints = new int[numPoints];
        int[] yPoints = new int[numPoints];
        int lowX = Integer.MAX_VALUE, lowY = Integer.MAX_VALUE, highX = 0, highY = 0;   
        String[] splitArray = new String[2];
        String[] inputArray = new String [numPoints];
        s.nextLine();
        for (int i = 0; i < numPoints; i++) {
            inputArray[i] = s.nextLine();
        }
        //end input
        for (int i = 0; i < numPoints; i++) {
            splitArray = inputArray[i].split(",");
            xPoints[i] = Integer.parseInt(splitArray[0].trim());
            yPoints[i] = Integer.parseInt(splitArray[1].trim());
        }
        
        for (int i = 0; i < numPoints; i++) {
            if (xPoints[i] < lowX) {
                lowX = xPoints[i];
            } else if (xPoints[i] > highX) {
                highX = xPoints[i];
            }
            if (yPoints[i] < lowY) {
                lowY = yPoints[i];
            } else if (yPoints[i] > highY) {
                highY = yPoints[i];
            }
        }
        System.out.println((lowX - 1) + ", " + (lowY - 1));
        System.out.println((highX + 1) + ", " + (highY + 1));
    }
}
