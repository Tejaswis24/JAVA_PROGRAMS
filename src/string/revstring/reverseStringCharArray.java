package string.revstring;

public class reverseStringCharArray {

    public static void main(String[] args) {

        String str = "Hello";

        char[] ch = str.toCharArray();

        System.out.println("Reversed String:");

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
