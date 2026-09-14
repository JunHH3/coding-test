package jun.coding_test.day00;

import java.util.Arrays;
import java.util.List;

public class day09_3 {
    public static void main(String[] args) {

        int sum = 0;
        List<Integer> numbers = Arrays.asList(5, 8, 13, 2, 7, 10);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
    }
}
