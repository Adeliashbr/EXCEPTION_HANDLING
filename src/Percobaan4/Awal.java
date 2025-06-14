package Percobaan4;

public class Awal {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a","b","c"};
        try {
            System.out.println(b[3]);
            System.out.println(bil/0);
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
