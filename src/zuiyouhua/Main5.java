package zuiyouhua;

import static java.lang.Math.*;

/**
 * 最速下降法
 */
public class Main5 {
    public static void main(String[] args){
        int i = 0;
        double[] x = {0,0};
        double[] gradient = {6.0 * x[0] + 2, 6.0 * x[1] - 4};
        while (i ++ < 100 && sqrt(pow(gradient[0],2) + pow(gradient[1],2)) > 0.1){
            double[] d = {-1.0 * gradient[0],-1.0 * gradient[1]};
            double lamda = ((4.0 - 6.0 * x[1]) * d[1] - (2.0 + 6.0 * x[0]) * d[0]) / (6.0 * pow(d[0],2) + 6.0 * pow(d[1],2));
            x[0] = x[0] + 1.0 * lamda * d[0];
            x[1] = x[1] + 1.0 * lamda * d[1];
            System.out.println("x:"+x[0] + "," + x[1]);
            gradient[0] = 6.0 * x[0] + 2.0;
            gradient[1] = 6.0 * x[1] - 4.0;

            System.out.println("lamda:" + lamda);
            System.out.println("d:" + d[0] + "," + d[1]);
        }
        System.out.println("x:"+x[0] + "," + x[1]);
        System.out.println(3.0 * x[0] * x[0] + 2.0 * x[1] + 3.0 * x[1] * x[1] - 4.0 * x[1]);
    }
}
