package jun.coding_test.day00;

public class day04_3 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 8, 4, 10, 3, 12};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 5) {
                System.out.println(arr[i]);
            }
        }
    }
}
