package dev.coding_test.day01;

public class day12_3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == 12) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
