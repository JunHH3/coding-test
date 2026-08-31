package jun.coding_test.ct.ct00;

import java.util.Scanner;

public class CT08 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int age = s.nextInt();

        if (age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }
    }
}
