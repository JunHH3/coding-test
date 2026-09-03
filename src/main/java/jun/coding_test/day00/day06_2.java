package jun.coding_test.day00;

public class day06_2 {
    public static void main(String[] args) {

        int count = 0;

        int[] arr = {2, 5, 7, 8, 11, 14};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
