package baidu;

import com.mysql.cj.exceptions.CJPacketTooBigException;

import java.math.BigDecimal;
import java.util.*;

import java.math.BigDecimal;
import java.util.*;

//public class Main {
//    public static void main(String[] args){
////        BigDecimal b1 = new BigDecimal(1);
////        BigDecimal b2 = new BigDecimal(2);
////        System.out.println(b1.compareTo(b2));
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        ArrayList<BigDecimal> arr = new ArrayList<>();
//        for (int i = 0; i < num; i ++) {
//            BigDecimal temp = scan.nextBigDecimal();
//            arr.add(temp);
//        }
//        Collections.sort(arr, new Comparator<BigDecimal>() {
//            @Override
//            public int compare(BigDecimal o1, BigDecimal o2) {
//                if (o1.compareTo(o2) < 0)
//                    return 1;
//                return -1;
//            }
//        });
//        for (int i = 0; i < num - 1; i ++){
//            if (arr.get(i).compareTo(new BigDecimal(num)) < 0){
//                System.out.println(i);
//                break;
//            }else{
//                arr.set(i + 1, arr.get(i + 1).add(new BigDecimal(i + 1)));
//            }
//        }
//    }
//}

public class Main2 {
    public static void main(String[] args){
//        BigDecimal b1 = new BigDecimal(1);
//        BigDecimal b2 = new BigDecimal(2);
//        System.out.println(b1.compareTo(b2));
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<BigDecimal> arr = new ArrayList<>();
        for (int i = 0; i < num; i ++) {
            BigDecimal temp = scan.nextBigDecimal();
            arr.add(temp);
        }
//        Collections.sort(arr, new Comparator<BigDecimal>() {
//            @Override
//            public int compare(BigDecimal o1, BigDecimal o2) {
//                if (o1.compareTo(o2) < 0)
//                    return 1;
//                return -1;
//            }
//        });
        int i = 0;
        while(true){
            BigDecimal bmax = maxNumber(arr,num);
            if (bmax.compareTo(new BigDecimal(num)) < 0){
                System.out.println(i);
                break;
            }
            i ++;
        }
    }

    public static BigDecimal maxNumber(ArrayList<BigDecimal> list, int num){
        BigDecimal bmax = new BigDecimal(0);
        int index = -1;
        for (int i = 0; i < list.size(); i ++)
            if (list.get(i).compareTo(bmax) > 0) {
                index = i;
                bmax = list.get(i);
            }
        for (int i = 0; i < list.size(); i ++)
            if (i != index) {
                list.set(i,list.get(i).add(new BigDecimal(1)));
            }else{
                list.set(i,list.get(i).subtract(new BigDecimal(num)));
            }
        return bmax;
    }
}
