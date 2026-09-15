package dev.coding_test.day01;

public class day12_2 {
    public static void main(String[] args) {

        int count = 0;
        int[] arr = {2, 4, 6, 8, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 12) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
