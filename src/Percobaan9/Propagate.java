package Percobaan9;

public class Propagate {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("this is a string"));
        } catch (Exception e) {
            System.out.println("the string was blank");
        }
        finally
        {
            System.out.println("all done ");

        }
    }
    
}

public static String reverse(String s) throws Exception
{
    if (s.length()==0) {
        throw new  Exception();
    }
    For(int=s.length()-1 ; i>=0 --i) {
        reverseStr+=s.charAt(i);
    }
    return reverseStr;

}
