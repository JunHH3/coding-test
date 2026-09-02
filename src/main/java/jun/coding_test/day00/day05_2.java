package jun.coding_test.day00;

public class day05_2 {
    public static void main(String[] args) {

        int[] arr = {7, 2, 15, 4, 9};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
