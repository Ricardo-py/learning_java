package test;

public class IntegerTest {
    public static void main(String[] args){
        objPoolTest();
    }

    public static void objPoolTest(){
        Integer i1 = 400;
        Integer i2 = 400;
        Integer i4 = 0;
        Integer i3 = new Integer(40);
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
    }
}
