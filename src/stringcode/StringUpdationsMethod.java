package stringcode;

public class StringUpdationsMethod
{
    public static void main(String[] args)
    {
        String name="my name is Dnyaneshwar kasare";
        System.out.println(name.replace("is","was"));//This method match the character of the given string
        System.out.println(name.replaceFirst("my","his"));
        System.out.println(name.replaceAll("kasare","Raut"));
        System.out.println(name.replaceAll("Dnyaneshwar(.)*","Rahul"));
        System.out.println(name.replaceAll("is(.*)","was"));//ignore all the words after replace string and print them
    }
}
