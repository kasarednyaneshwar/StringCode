package stringcode;

public class StringSearchingMethod
{
    public static void main(String[] args) {
        String myname = "Dnyaneshwar";
        System.out.println(myname.length());
        System.out.println(myname.indexOf('D'));
        System.out.println(myname.lastIndexOf('a'));
        System.out.println(myname.lastIndexOf('h'));
        System.out.println(myname.lastIndexOf('D'));
        System.out.println(myname.indexOf("ne"));
        System.out.println(myname.contains("abc"));
        System.out.println(myname.contains("war"));
        System.out.println(myname.startsWith("Dn"));
        System.out.println(myname.endsWith("Dn"));
    }


}
