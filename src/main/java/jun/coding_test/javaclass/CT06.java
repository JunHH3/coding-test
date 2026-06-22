package jun.coding_test.javaclass;

import java.util.Scanner;

public class CT06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       // int a = s.nextInt();   score 로 변경 *
        int score = s.nextInt();


        if (score >= 60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
