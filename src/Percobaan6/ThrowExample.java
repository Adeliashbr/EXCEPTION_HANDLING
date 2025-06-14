package Percobaan6;

public class ThrowExample {

    static void demo(){
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
        //Baris ini tidak lagi dikerjakan;
        System.out.println("ini tidak lagi dicetak");

    }
    public static void main(String[] args) {
        try {
            demo();
            System.out.println("selesai");
        } catch (Exception e) 
        {
            System.out.println("Ada pesan error:" + e );
        }
    }

}
