package dev.coding_test.day01;

public class day12 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    System.out.println(arr[i] + " " +  arr[j]);
                }
            }
        }
    }
}
