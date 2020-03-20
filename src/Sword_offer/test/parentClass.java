package Sword_offer.test;

public class parentClass {
    public static int A = 1;
    public static int B;
    static {
        B = 2;
        A = 2;
    }

    public static void main(String[] args){
        subClass sub = new subClass();
        System.out.println(sub.A);
    }
}


