package jun.coding_test.javaclass;

import java.util.Scanner;

public class CT04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
