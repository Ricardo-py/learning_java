package test;

public class ArrayTest {
    public static void main(String[] args){
        int[] num = {3,4};
        ArraySort(num);
        System.out.println(num[0]);
        System.out.println(num[1]);
    }

    public static void ArraySort(int[] num){
        num[0] = 1;
        num[1] = 2;
    }
}
