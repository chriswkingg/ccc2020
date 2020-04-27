
package ccc2020;

import java.util.*;
public class J4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        String string = s.next();
        ArrayList<String> shifts = new ArrayList<String>();
        char tempChar;
        char[] charList = new char[string.length()];
        charList = string.toCharArray();
        boolean output = false;
        while(true) {
            tempChar = charList[0];
            for (int i = 0; i < charList.length - 1; i++) {
                charList[i] = charList[i + 1];
            }
            charList[charList.length - 1] = tempChar;
            if (!shifts.contains(String.valueOf(charList))) {
                shifts.add(String.valueOf(charList));
            } else { 
                break;
            }
        } //end WHile
        for (int i = 0; i < shifts.size(); i++) {
            if (text.contains(shifts.get(i))) {
                output = true;
                break;
            }
        }
        if (output) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}



