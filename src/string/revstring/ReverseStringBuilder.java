package string.revstring;

public class ReverseStringBuilder {
    public static void main(String[] args) {

        String str = "Hello";

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // Reverse the string
        sb.reverse();

        // Print reversed string
        System.out.println("Reversed String: " + sb);
    }
}