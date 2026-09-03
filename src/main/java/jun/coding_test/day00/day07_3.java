package jun.coding_test.day00;

public class day07_3 {
    public static void main(String[] args) {

        int count = 0;

        String str = "coffee";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                count++;
            }
        }
        System.out.println(count);
    }
}
