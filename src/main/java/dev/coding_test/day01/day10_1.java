package dev.coding_test.day01;

import java.util.HashMap;
import java.util.Map;

public class day10_1 {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("java",90);
        scores.put("spring", 80);
        scores.put("sql", 85);

        System.out.println(scores.get("spring"));

        if (scores.containsKey("spring")) {
            System.out.println("있음");
        }
    }


}
