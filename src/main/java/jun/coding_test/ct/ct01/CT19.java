package jun.coding_test.ct.ct01;

import java.util.Scanner;

public class CT19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

            if (arr[i] < 5) {
                count++;
            }
        }
        System.out.println(count);
    }

}
