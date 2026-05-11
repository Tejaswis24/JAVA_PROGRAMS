package string.revstring;
import java.util.Scanner;

public class reverseStringScanner {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Print reversed string
        System.out.println("Reversed string: " + reversed);

        // Close scanner
        sc.close();
    }
}
