package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            System.out.println("product = " + Arrays.toString(product));
            String key = product[0];
            String value = product[1];

            productMap.put(key, Integer.valueOf(value));
        }

        for (String key : productMap.keySet()) {
            Integer value = productMap.get(key);

            System.out.println("제품: " + key + ", 가격: " + value);

        }


    }
}
