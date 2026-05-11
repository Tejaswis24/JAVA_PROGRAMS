package string.revstring;

public class ReverseStringAppend {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder reverse = new StringBuilder();

        // Reverse string using append()
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.println("Reversed String:" + reverse);
    }

}
