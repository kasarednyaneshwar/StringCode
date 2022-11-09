package stringcode;

public class ObjectRefferenceString
{
    public static void main(String[] args)
    {
        String s1="Dnyaneshwar";
        String s2="Sager";
        String s3="deepak";
        String s4="Rahul";
        if(s1==s2)//reffer to differnt object
        {
            System.out.println("print same object reference");
        }
        else{
            System.out.println("object reference is not same");
        }
        if(s1.equals(s2))//object content is same
        {
            System.out.println("print same object reference");
        }
        else{
            System.out.println("object reference is not same");
        }

        if(s3==s4)
        {
            System.out.println("print same object reference");
        }
        else{
            System.out.println("object reference is not same");
        }
        String s5=new String("keshav");
        String s6=new String("keshav");
        if(s5.equals(s6))
        {
            System.out.println("print same object reference");
        }
        else{
            System.out.println("object reference is not same");
        }
    }
}
