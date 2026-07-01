package jun.coding_test.ct02;

import java.util.Scanner;

public class CT17 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
