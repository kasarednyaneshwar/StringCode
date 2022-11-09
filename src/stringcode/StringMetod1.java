package stringcode;

//how to find maximum character occur in a given string

public class StringMetod1
{
    public static void main(String[] args)
    {
        String s="Dnyaneshwar";
        int[] arrySize=new int[127];
        int i=0;
        for(i=0;i<s.length();i++)
        {
            arrySize[s.charAt(i)]=arrySize[s.charAt(i)]+1;

        }
        int max=1;


        for(i=0;i<s.length();i++)
        {
            if (max < arrySize[s.charAt(i)])
            {
                max=arrySize[s.charAt(i)];

            }
            System.out.println("maximum character repeated");
        }






    }
}
