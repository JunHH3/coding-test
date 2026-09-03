package jun.coding_test.day00;

public class day07_2 {
    public static void main(String[] args) {

        int count = 0;
        String str = "banana";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
