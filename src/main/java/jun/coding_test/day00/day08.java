package jun.coding_test.day00;

public class day08 {
    public static void main(String[] args) {

        int sum = 0;

        int[] arr = {3, 8, 5, 12, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
               sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
