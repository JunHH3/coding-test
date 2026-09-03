package jun.coding_test.day00;

public class day06 {
    public static void main(String[] args) {

        int count = 0;

        int[] arr = {3, 8, 2, 11, 6, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
               count++;
            }
        }
        System.out.println(count);
    }
}
