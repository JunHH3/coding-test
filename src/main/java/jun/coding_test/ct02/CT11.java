package jun.coding_test.ct02;

import java.util.Scanner;

public class CT11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
