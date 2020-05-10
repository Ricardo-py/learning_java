package zuiyouhua;

/**
 * Dicotomous法
 */
public class Main4 {
    public static void main(String[] args){
        double a = -10.0;
        double b = 10.0;
        double sigma = 0.01;
        double l = (a + b) / 2.0 - sigma;
        double r = (a + b) / 2.0 + sigma;
        int i = 1;
        System.out.println("初始值：a:" + a + " l:" + l + " r:"+ r + " b:" + b);
        while (b - a > 0.1){
            if (f(l) < f(r))
                b = r;
            else
                a = l;
            l = (a + b) / 2.0 - sigma;
            r = (a + b) / 2.0 + sigma;
            System.out.println("第"+i+"次：a:" + a + " l:" + l + " r:"+ r + " b:" + b);
            i ++;
        }
    }

    public static double f(double x){
        return 1.0 * x * x + 4.0 * x + 5.0;
    }
}
