package jun.coding_test.ct01;

import java.util.Scanner;

public class CT10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 2 == 0 && n > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
