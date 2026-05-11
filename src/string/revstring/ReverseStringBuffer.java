package string.revstring;

public class ReverseStringBuffer {
    public static void main(String[] args) {
        String original = "Hello World";

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer(original);

        // Reverse the string
        sb.reverse();

        // Print reversed string
        System.out.println("Reversed string: " + sb);
    }
}
