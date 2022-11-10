package task2;

import java.util.*;

public class Task2 {

    public static String codeString(String string) {
        List<Character> chars = new ArrayList<>();
        HashMap<Character, Integer> mMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (mMap.containsKey(ch)) {
                mMap.put(ch, mMap.get(ch) + 1);
                continue;
            }
            mMap.put(ch, 1);
            chars.add(ch);
        }

        StringBuilder codedString = new StringBuilder("");
        for (char el : chars) {
            codedString.append(el);
            codedString.append(mMap.get(el));
        }
        return codedString.toString();
    }


    public static String codeString2(String string) {
        if(string.equals("")) return "";
        StringBuilder codedString = new StringBuilder("");
        char prevChar = string.charAt(0);
        codedString.append(prevChar);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char currChar = string.charAt(i);
            if (currChar == prevChar) {
                count++;
                continue;
            }
            codedString.append(count);
            codedString.append(currChar);
            prevChar = currChar;
            count = 1;
        }
        codedString.append(count);
        return codedString.toString();
    }

}
