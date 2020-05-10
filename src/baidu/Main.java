package baidu;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    //找比这个数小的最大质数
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 1)
                System.out.println(1);
            else if (isPrim(number)){
                BigDecimal b1 = new BigDecimal(number);
                BigDecimal b2 = new BigDecimal(number - 1);
                System.out.println(b1.multiply(b2).subtract(new BigDecimal(1)));
            }else{
                for (int i = number - 1; i >= 1; i --)
                    if(isPrim(i)){
                        BigDecimal b1 = new BigDecimal(number);
                        BigDecimal b2 = new BigDecimal(i);
                        System.out.println(b1.multiply(b2).subtract(new BigDecimal(1)));
                        break;
                    }
            }
        }
    }


    public static boolean isPrim(int number){
        if (number == 1)
            return true;
        for (int i = 2; i <= Math.sqrt(number); i ++)
            if (number % i == 0)
                return false;
        return true;
    }
}
