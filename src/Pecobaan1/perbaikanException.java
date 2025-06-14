package Pecobaan1;

public class perbaikanException {

    public static void main(String[] args) {
        int a [] = new int [5];
        try {
            a [5] = 100;
        } catch (Exception e) 
        {
            System.out.println("terjadi pelanggaran memory");
        }
    }
    
}
