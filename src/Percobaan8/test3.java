package Percobaan8;

import java.io.IOException;

public class test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException {
        System.out.println(20/0);
        System.out.println("Method B");
    }
    
}
class utama {
    public static void main(String[] args) throws IOException {
        test3 C= new test3();
        c.methodA();
        c.methodB(); 
        
    }
}
