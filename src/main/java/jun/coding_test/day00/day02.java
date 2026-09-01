package jun.coding_test.day00;

public class day02 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
               sum += i;
            }
        }
        System.out.println(sum);
    }
}
