package jun.coding_test.day00;

import java.util.Arrays;
import java.util.List;

public class day09 {
    public static void main(String[] args) {

        int sum = 0;
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 4);

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
