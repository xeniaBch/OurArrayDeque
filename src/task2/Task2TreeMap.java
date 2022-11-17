package task2;

import java.util.Map;
import java.util.TreeMap;

public class Task2TreeMap {
// я не поняла всю прелесть TreeMap, мне нужно объяснить чем эта структура хороша для этой задачи,
// мне кажется, что мое предыдущее решение покрывает больше кейсов

    public static String codeString(String string) {
        TreeMap<Character, Integer> chars = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
                continue;
            }
            chars.put(ch, 1);
        }

        StringBuilder codedString = new StringBuilder("");
        for(Map.Entry<Character,Integer> entry : chars.entrySet()) {
            codedString.append(entry.getKey());
            codedString.append(entry.getValue());
        }
        return codedString.toString();
    }

    public static void main(String[] args) {
        String string = "aaaabccc";
        System.out.println(codeString(string));
    }
}