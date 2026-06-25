package jun.coding_test.ct02;

import java.util.Scanner;

public class CT12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            int start = s.nextInt();
            int end = s.nextInt();

            int sum = 0;

            for (int j = start - 1; j <= end - 1; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
}


