package dev.coding_test.day00;

import java.util.Arrays;
import java.util.List;

public class day09_2 {
    public static void main(String[] args) {
        
        int count = 0;
        List<Integer> numbers = Arrays.asList(4, 12, 7, 18, 3, 11);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
