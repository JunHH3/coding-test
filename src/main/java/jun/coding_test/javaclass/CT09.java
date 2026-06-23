package jun.coding_test.javaclass;

import java.util.Scanner;

public class CT09 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 3 == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("not multiple");
        }
    }
}
