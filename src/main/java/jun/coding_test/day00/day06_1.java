package jun.coding_test.day00;

public class day06_1 {
    public static void main(String[] args) {

        int count = 0;

        int[] arr = {5, 12, 3, 18, 10, 21};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
