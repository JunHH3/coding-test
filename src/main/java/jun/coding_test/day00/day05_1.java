package jun.coding_test.day00;

public class day05_1 {
    public static void main(String[] args) {

        int[] arr = {7, 2, 15, 4, 9};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
