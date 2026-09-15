package jun.coding_test.day01;

import java.util.HashSet;
import java.util.Set;

public class day10 {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

            numbers.add(3);
            numbers.add(5);
            numbers.add(7);
            numbers.add(5);
            numbers.add(3);

        System.out.println(numbers.size());
    }
}
