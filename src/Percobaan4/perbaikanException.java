package Percobaan4;

public class perbaikanException {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a","b","c"};
        try {
            System.out.println(bil/0);
            System.out.println(b[3]);
        } catch (ArithmeticException e) 
        {
            System.out.println("terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("melebihi jumlah array");

        }
        catch(Exception e)
        {
            System.out.println( "ini menghandle error yang terjadi ");

        }
        
    }
    
}
