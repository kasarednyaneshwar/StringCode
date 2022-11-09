package stringcode;

public class StringComparisionmethodJava
{
    public static void main(String[] args)
    {
        String firstName="Yogesh";
        String secondName="Yogesh";
        String thirdName="yogesh";
        System.out.println(firstName.equals(secondName));
        System.out.println(secondName.equals(thirdName));
        System.out.println(firstName.equalsIgnoreCase(thirdName));
        System.out.println(firstName.equals(""));
    }
}
