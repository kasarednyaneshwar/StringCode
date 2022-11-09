package stringcode;

import java.util.Scanner;

public class StringCode1
{
    public static void main(String[] args)
    {
        System.out.println("Enter your string name");
        Scanner sc=new Scanner(System.in);
        String myName=sc.nextLine();
        String rev="";
        int i;
        for(i=myName.length()-1;i>=0;i--)
        {
            rev=rev+myName.charAt(i);
        }
        System.out.println("Reverse string of my Name is :"+rev);
    }
}
