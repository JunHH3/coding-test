package dev.coding_test.day01;

public class day15_1 {
    public static void main(String[] args) {

        int count = 0;
        int[] arr = {-6, 0, 3, 7, 9, 12};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
