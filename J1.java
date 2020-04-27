
package ccc2020;
import java.util.*;

public class J1 { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int small = s.nextInt();
        int med = s.nextInt();
        int large = s.nextInt();
        if (((small) + (2*med) + (3*large)) >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
