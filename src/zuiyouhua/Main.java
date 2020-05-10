package zuiyouhua;

/**
 * 黄金分割法
 */
public class Main {
    public static void main(String[] args){
        double a = 0;
        double b = 1000.0;
        double t = (Math.sqrt(5.0) - 1) / 2.0;
        double w = a + (1 - t) * (b - a);
        double u = a + t * (b - a);
        System.out.println("初始值 a:" + a + " w:" + w + " u:" + u + " b:" + b);
        int i = 1;
        while (b - a > 10){
            if(f(w) < f(u)){
                System.out.println("第" + i +"次：f(w) < f(u):");
                b = u;
                u = w;
                w = a + (1 - t) * (b - a);
            }else{
                System.out.println("第" + i + "次:f(w) > f(u):");
                a = w;
                w = u;
                u = a + t * (b - a);
            }
            i ++;
            System.out.println("a:" + a + " w:" + w + " u:" + u + " b:" + b);
        }
        System.out.println((b + a) / 2);
    }
    public static double f(double x){
        return 1.0 / 2 * x * x -  x;
    }
}
