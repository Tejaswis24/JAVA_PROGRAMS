package string;

public class palindromeStringBuilder
{
    public static void main(String[] args)
    {
        String str= "MADAM";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev)?"Palindrome":"Not Palindrome");

    }
}
