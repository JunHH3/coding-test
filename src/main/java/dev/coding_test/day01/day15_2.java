package dev.coding_test.day01;

public class day15_2 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        int[] arr = {2, 5, 6, 9, 12, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("합계: " + sum);
        System.out.println("개수: " + count);
    }
}