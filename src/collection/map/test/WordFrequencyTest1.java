package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");

        Map<String, Integer> textMap = new HashMap<>();
/*        for (String word : words) {
            if (!textMap.containsKey(word)) {
                textMap.put(word, 1);
            } else {
                textMap.put(word, textMap.get(word) + 1);
            }
        }*/

        for (String word : words) {
            Integer count = textMap.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            textMap.put(word, count);
        }

        System.out.println(textMap);


    }
}
