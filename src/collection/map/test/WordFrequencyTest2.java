package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");

        Map<String, Integer> textMap = new HashMap<>();
        for (String word : words) {
            textMap.getOrDefault(word, textMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(textMap);


    }
}
