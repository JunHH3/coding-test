package jun.coding_test.day00;

public class day08_2 {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {4, 9, 12, 3, 8, 7};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > 5) {
                    sum += arr[i];
                }

            }
        }
        System.out.println(sum);
    }
}
