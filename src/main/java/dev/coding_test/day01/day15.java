package dev.coding_test.day01;

public class day15 {
    public static void main(String[] args) {

        int count = 0;
        int[] arr = {2, 8, 7, 12, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 5) {
                count += arr[i];
            }
        }
        System.out.println(count);
    }
}

