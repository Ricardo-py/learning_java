//package kuaishou;
//
//
//import org.junit.Test;
//
//import java.util.*;
//
////public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
////        int a = in.nextInt();
////        int b = in.nextInt();
////        System.out.println(a + b);
////        }
////      @Test
//////    public void run(){
//////        int[] height = {175, 179, 174, 163, 176, 177};
//////        int[] res = DistanceToHigher(height);
//////        for (int i = 0; i < res.length; i ++)
//////            System.out.println(res[i]);
//////    }
//////
//////    public int[] DistanceToHigher (int[] height) {
//////        // write code here
//////        if (height == null || height.length == 0)
//////            return null;
//////        int[] res = new int[height.length];
//////        res[0] = 0;
//////        for(int i = 1; i < height.length; i ++){
//////            int j = i - 1;
//////            while (j >= 0 && height[j] <= height[i]) {
//////                j --;
//////            }
//////            if (j < 0)
//////                res[i] = 0;
//////            else
//////                res[i] = i - j;
//////        }
//////        return res;
//////    }
//
////2.
////public static void main(String[] args){
////
////        Scanner scan = new Scanner(System.in);
////        String s = scan.nextLine();
////        String[] ss = s.split(" ");
////        boolean flag = false;
////        if (ss == null || ss.length == 0 || ss.length == 1) {
////        flag = true;
////        System.out.println("-1");
////        }
////        Map<Integer, Integer> map = new HashMap<>();
////
////        int[] numbers = new int[ss.length];
////
////        for (int i = 0; i < numbers.length; i ++){
////        numbers[i] = Integer.valueOf(ss[i]);
////        }
////
////        int the_most_big_number = numbers[0];
////        int the_second_big_number = Integer.MIN_VALUE;
////        map.put(the_most_big_number, 1);
////        map.put(the_second_big_number, 0);
////
////
////
////        for (int i = 1; i < numbers.length; i ++){
////        if (numbers[i] < the_most_big_number && numbers[i] >= the_second_big_number){
////        if (map.get(the_most_big_number) == 1) {
////        if (flag)
////        System.out.print(" ");
////        flag = true;
////        System.out.print(i);
////        }
////        }
////        if (numbers[i] > the_most_big_number){
////        the_second_big_number = the_most_big_number;
////        map.put(the_second_big_number,map.get(the_most_big_number));
////        the_most_big_number = numbers[i];
////        map.put(the_most_big_number,1);
////        }
////        }
////        if (!flag)
////        System.out.print(-1);
////        }
///*
//   private String number;
//    private int baozi;
//    private int shunzi;
//    private int value;
//    private boolean isLianghao;
//
//    public void setLianghao(boolean lianghao) {
//        isLianghao = lianghao;
//    }
//
//    public phoneNumber(String number, int baozi, int shunzi, int value, boolean isLianghao) {
//        this.number = number;
//        this.baozi = baozi;
//        this.shunzi = shunzi;
//        this.value = value;
//        this.isLianghao = isLianghao;
//    }
//
//    public boolean isLianghao() {
//        return isLianghao;
//    }
//
//    @Override
//    public String toString() {
//        return "phoneNumber{" +
//                "number='" + number + '\'' +
//                ", baozi=" + baozi +
//                ", shunzi=" + shunzi +
//                ", value=" + value +
//                ", isLianghao=" + isLianghao +
//                '}';
//    }
//
//    public phoneNumber(String number, int baozi, int shunzi, int value) {
//        this.number = number;
//        this.baozi = baozi;
//        this.shunzi = shunzi;
//        this.value = value;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public int getBaozi() {
//        return baozi;
//    }
//
//    public void setBaozi(int baozi) {
//        this.baozi = baozi;
//    }
//
//    public int getShunzi() {
//        return shunzi;
//    }
//
//    public void setShunzi(int shunzi) {
//        this.shunzi = shunzi;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        List<phoneNumber> arr = new ArrayList<>();
//        String[] numbers = s.split(",");
//        for (int i = 0; i < numbers.length; i ++){
//            String ss = numbers[i].substring(3,11);
//            int isBaozi = isBaozi(ss);
//            int isshunzi = isShunzi(ss);
//            int value = isBaozi > isshunzi ? isBaozi : isshunzi;
//            phoneNumber pn = new phoneNumber(numbers[i],isBaozi,isshunzi,value,value > 2);
//            System.out.println(pn);
//            arr.add(pn);
//        }
//        Collections.sort(arr, new Comparator<phoneNumber>() {
//            @Override
//            public int compare(phoneNumber o1, phoneNumber o2) {
//                if (o1.getValue() > o2.getValue())
//                    return - 1;
//                else if (o1.getValue() == o2.getValue()){
//                    if (o1.getBaozi() == o2.getBaozi()){
//                        if (o1.getShunzi() > o2.getShunzi())
//                            return -1;
//                        else
//                            return 1;
//                    }
//                    return o1.getBaozi() > o2.getBaozi() ? -1 : 1;
//                }
//                return 1;
//            }
//        });
//        boolean flag = false;
//        for(phoneNumber ph : arr){
//            if (ph.isLianghao()){
//                if (flag)
//                    System.out.print(",");
//                flag = true;
//                System.out.print(ph.getNumber());
//            }
//        }
//        if (!flag)
//            System.out.println("null");
//    }
//
//    public static int isShunzi(String s){
//        int number = 1;
//        int maxnumber = 1;
//        for(int i = 1; i < s.length(); i ++){
//            if (s.charAt(i) - s.charAt(i - 1) == 1)
//                number ++;
//            else
//                number = 1;
//            if (number > maxnumber)
//                maxnumber = number;
//        }
//        return maxnumber;
//    }
//
//    public static int isBaozi(String s){
//        //48 ~ 57
//        int maxnumber = 1;
//        int number = 1;
//        for(int i = 1; i < s.length(); i ++){
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                number++;
//            }
//            else {
//                number = 1;
//            }
//            if (number > maxnumber)
//                maxnumber = number;
//        }
//        return maxnumber;
//    }
// */
///*
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        String[] ss = s.split(" ");
//        boolean flag = false;
//        if (ss == null || ss.length == 0 || ss.length == 1){
//            flag = true;
//            System.out.println("-1");
//        }
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int[] numbers = new int[ss.length];
//
//        for (int i = 0; i < numbers.length; i ++){
//            numbers[i] = Integer.valueOf(ss[i]);
//        }
//
//        int the_most_big_number = numbers[0];
//        int the_second_big_number = Integer.MIN_VALUE;
//        map.put(the_most_big_number, 1);
//        map.put(the_second_big_number, 0);
//
//
//        for (int i = 1; i < numbers.length; i ++){
//            if (numbers[i] < the_most_big_number && numbers[i] >= the_second_big_number){
//                if (map.get(the_most_big_number) == 1) {
//                    if (flag)
//                        System.out.print(" ");
//                    flag = true;
//                    System.out.print(i);
//                }
//            }
//
//            if (numbers[i] == the_most_big_number){
//                map.put(numbers[i],map.get(the_most_big_number) + 1);
//            }
//
//            if (numbers[i] > the_most_big_number){
//                the_second_big_number = the_most_big_number;
//                map.put(the_second_big_number,map.get(the_most_big_number));
//                the_most_big_number = numbers[i];
//                map.put(the_most_big_number,1);
//            }else if (numbers[i] > the_second_big_number){
//                the_second_big_number = numbers[i];
//            }
//
//        }
//        if (!flag)
//            System.out.print(-1);
//* */
//import java.util.*;
//import java.util.*;
//
//class phoneNumber{
//    private String number;
//    private int baozi;
//    private int shunzi;
//    private int value;
//    private boolean isLianghao;
//
//    public void setLianghao(boolean lianghao) {
//        isLianghao = lianghao;
//    }
//
//    public phoneNumber(String number, int baozi, int shunzi, int value, boolean isLianghao) {
//        this.number = number;
//        this.baozi = baozi;
//        this.shunzi = shunzi;
//        this.value = value;
//        this.isLianghao = isLianghao;
//    }
//
//    public boolean isLianghao() {
//        return isLianghao;
//    }
//
//    @Override
//    public String toString() {
//        return "phoneNumber{" +
//                "number='" + number + '\'' +
//                ", baozi=" + baozi +
//                ", shunzi=" + shunzi +
//                ", value=" + value +
//                ", isLianghao=" + isLianghao +
//                '}';
//    }
//
//    public phoneNumber(String number, int baozi, int shunzi, int value) {
//        this.number = number;
//        this.baozi = baozi;
//        this.shunzi = shunzi;
//        this.value = value;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public int getBaozi() {
//        return baozi;
//    }
//
//    public void setBaozi(int baozi) {
//        this.baozi = baozi;
//    }
//
//    public int getShunzi() {
//        return shunzi;
//    }
//
//    public void setShunzi(int shunzi) {
//        this.shunzi = shunzi;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        List<phoneNumber> arr = new ArrayList<>();
//
//        String[] numbers = s.split(",");
//        phoneNumber[] phs = new phoneNumber[numbers.length];
//        for (int i = 0; i < numbers.length; i ++){
//            String ss = numbers[i].substring(3,11);
//            int isBaozi = isBaozi(ss);
//            int isshunzi = isShunzi(ss);
//            int value = isBaozi > isshunzi ? isBaozi : isshunzi;
//            phoneNumber pn = new phoneNumber(numbers[i],isBaozi,isshunzi,value,value > 2);
//            arr.add(pn);
//        }
//        Collections.sort(arr, new Comparator<phoneNumber>() {
//            @Override
//            public int compare(phoneNumber o1, phoneNumber o2) {
//                if (o1.getValue() > o2.getValue())
//                    return - 1;
//                else if (o1.getValue() == o2.getValue()){
//                    if (o1.getBaozi() == o2.getBaozi()){
//                        if (o1.getShunzi() > o2.getShunzi())
//                            return -1;
//                        else
//                            return 1;
//                    }
//                    return o1.getBaozi() > o2.getBaozi() ? -1 : 1;
//                }
//                return 1;
//            }
//        });
//
//        boolean flag = false;
//        for(phoneNumber ph : arr){
//            if (ph.isLianghao()){
//                if (flag)
//                    System.out.print(",");
//                flag = true;
//                System.out.print(ph.getNumber());
//            }
//        }
//        if (!flag)
//            System.out.println("null");
//
//        for (int j = 1; j < numbers.length; j ++){
//            int k = j;
//            for (int i = j - 1; i >= 0; i --)
//                while (comp(phs[k],phs[]))
//        }
//
//    }
//
//    public static int comp(phoneNumber o1, phoneNumber o2){
//            if (o1.getValue() > o2.getValue())
//                return - 1;
//            else if (o1.getValue() == o2.getValue()){
//                if (o1.getBaozi() == o2.getBaozi()){
//                    if (o1.getShunzi() > o2.getShunzi())
//                        return -1;
//                    else
//                        return 1;
//                }
//                return o1.getBaozi() > o2.getBaozi() ? -1 : 1;
//            }
//            return 1;
//    }
//    public static int isShunzi(String s){
//        int number = 1;
//        int maxnumber = 1;
//        for(int i = 1; i < s.length(); i ++){
//            if (s.charAt(i) - s.charAt(i - 1) == 1)
//                number ++;
//            else
//                number = 1;
//            if (number > maxnumber)
//                maxnumber = number;
//        }
//        return maxnumber;
//    }
//
//    public static int isBaozi(String s){
//        //48 ~ 57
//        int maxnumber = 1;
//        int number = 1;
//        for(int i = 1; i < s.length(); i ++){
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                number++;
//            }
//            else {
//                number = 1;
//            }
//            if (number > maxnumber)
//                maxnumber = number;
//        }
//        return maxnumber;
//    }
//
//}
