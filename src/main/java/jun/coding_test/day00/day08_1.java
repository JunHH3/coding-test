package jun.coding_test.day00;


public class day08_1 {
    public static void main(String[] args) {

        int count = 0;
        String str = "backend";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
