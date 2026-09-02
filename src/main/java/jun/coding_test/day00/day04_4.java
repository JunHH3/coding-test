package jun.coding_test.day00;

public class day04_4 {
    public static void main(String[] args) {

        int[] arr = {3, 12, 7, 15, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < 10) {
                System.out.println(arr[i]);
            }

        }
    }
}
