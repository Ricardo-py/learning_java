package zuiyouhua;

/**
 * 二分法
 */
public class Main3 {
    public static void main(String[] args){
        double a = 0;
        double b = 1000.0;
        double u = 1.0 * (a + b) / 2;
        int i = 1;
        System.out.println("初始值：a:" + a + " u:" + u + " b:" + b);
        while(def(u) != 0){
            if (def(u) > 0)
                b = u;
            else
                a = u;
            u = 1.0 * (a + b) / 2;
            System.out.println("第"+i+"次：a:" + a + " u:" + u + " b:" + b);
            i ++;
        }
        System.out.println(def(u));
    }

    public static double def(double x){
        return x - 1;
    }
    public static double f(double x){
        return 1.0 / 2 * x * x - x;
    }
}
