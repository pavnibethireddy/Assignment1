public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "Reverse String";
        System.out.println("The entered string is: " + str);
        String rev = reverseString(str);
        System.out.println("The reversed string is: " + rev);
    }
    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}