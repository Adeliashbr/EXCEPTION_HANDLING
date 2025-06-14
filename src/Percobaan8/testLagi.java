package Percobaan8;

import java.io.IOException;

public class testLagi {
    
    public static void main(String[] args) throws IOException {
        test3 o=new test3();
        o.methodA();
        try {
            o.methodB();
        } catch (Exception e) {
            System.out.println("error di method B");
        }
        finally{
            System.out.println("ini selalu dicetak");
        }
    
}

    
}
