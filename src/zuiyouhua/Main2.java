package zuiyouhua;

/**
 * 斐波那契
 */
public class Main2 {
    private static double f1 = 1;
    private static double f2 = 1;
    private static double f3 = 2;
    public static void main(String[] args){
        double a = -10.0;
        double b = 10.0;
        double n1 = 1.0 * f1 / f3;
        double n2 = 1.0 * f2 / f3;
        double w = a + 1.0 * n1 * (b - a);
        double u = a + 1.0 * n2 * (b - a);
        System.out.println("初始值 a:" + a + " w:" + w + " u:" + u + " b:" + b);
        int i = 1;
        while (b - a > 0.1){
            if(f(w) < f(u)){
                System.out.println("第" + i +"次：f(w) < f(u):");
                b = u;
                u = w;
                w = a + n1 * (b - a);
            }else{
                System.out.println("第" + i + "次:f(w) > f(u):");
                a = w;
                w = u;
                u = a + n2 * (b - a);
            }
            i ++;
            fibnoacci();
            System.out.println("a:" + a + " w:" + w + " u:" + u + " b:" + b);
        }
        System.out.println((b + a) / 2);
    }

    public static void fibnoacci(){
        f1 = f2;
        f2 = f3;
        f3 = f1 + f2;
    }

    public static double f(double x){
        return 1.0 * x * x + 4.0 * x + 5.0;
    }
}
