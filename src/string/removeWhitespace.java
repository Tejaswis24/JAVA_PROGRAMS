package string;

public class removeWhitespace
{
    public static void main (String [] args)
    {
        String str = " Hello World ";
        String res = str.replaceAll(" ", "");
        System.out.println(res);
    }
}
