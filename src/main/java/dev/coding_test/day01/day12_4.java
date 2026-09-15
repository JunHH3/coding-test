package dev.coding_test.day01;

public class day12_4 {
    public static void main(String[] args) {

        int count = 0;
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
