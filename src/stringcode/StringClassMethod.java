package stringcode;

public class StringClassMethod
{
    public static void main(String[] args)
    {
        String m="Gaurav";
        String n="10";
        System.out.println(m+n);
        System.out.println(m.concat(n));//concatenation operator is used in java by addition of two variable.
        System.out.println(m+n+10);
        System.out.println(10+m+n);
        System.out.println(10+20+m+n);
        System.out.println(String.join(",",m,n));
        String s="he is like to play a cricket";
        System.out.println( s.substring(3,15));
        

    }
}
