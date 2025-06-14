package Percobaan7;

public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my exception");
        } catch (Exception e) 
        {
            System.out.println("caught exception");
            System.out.println("e.getMessage(): + e.getMessage()");
            System.out.println("e.toString():" + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
    
}
