package wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        Long number1 = scan.nextLong();
        Long number2 = scan.nextLong();
        Long res = number2 - number1;
        for (int i = 2; i < num; i ++){
            Long temp = scan.nextLong();
            res = getMax(temp - number2,res);
            number2 = temp;
        }
        if (res == 0)
            System.out.println(-1);
        else
            System.out.println(res);
    }

    public static Long getMax(Long number1, Long number2){
        Long n1,n2;
        if (number1.compareTo(number2) < 0) {
            n1 = number2;
            n2 = number1;
        }else{
            n1 = number1;
            n2 = number2;
        }
        while (n2 != 0){
            Long temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }
}
