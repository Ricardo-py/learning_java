package zuiyouhua;

import org.junit.Test;

public class Main8 {


    @Test
    public void test(){
        double[] b = {-1,-3,1};
        double[][] A = {{2,-2,1},{-2,4,0},{-1,0,2}};
        double[] x = {0,0,0};
        double[] r = subtract(b,mutiply(A,x));
        double[] p = new double[r.length];
        for (int i = 0; i < r.length; i ++)
            p[i] = r[i];
        double[] res = mutiply(p,A);
        System.out.println(res);
    }

    public static void main(String[] args){
        double[] b = {-1,-3,1};
        double[][] A = {{2,-2,-1},{-2,4,0},{-1,0,2}};
        double[] x = {0,0,0};
        double[] r = subtract(b,mutiply(A,x));
        double[] p = new double[r.length];
        for (int i = 0; i < r.length; i ++)
            p[i] = r[i];
        int k = 1;
        while (true){
            System.out.println("x:" + x[0]+","+x[1] + "," + x[2]);
            double arfa = 1.0 * mutiply(r,r) / mutiply(mutiply(p,A),p);
            x = add(x,mutiply(arfa,p));
            double[] r2 = subtract(r,mutiply(arfa,mutiply(A,p)));
            if (abs(r2) < 0.001)
                break;
            double beta = 1.0 * mutiply(r2,r2) / mutiply(r,r);
            p = add(r2,mutiply(beta,p));
            r = r2;
            k ++;
        }
        System.out.println("x:" + x[0]+","+x[1] + "," + x[2]);

        System.out.println(x[0] * x[0] - 2 * x[0] * x[1] + 2 * x[1] * x[1] + x[2] * x[2] - x[0] * x[2] + x[0] + 3 * x[1] - x[2]);
    }

    public static double[] mutiply(double[][] A, double[] b){
        if(A[0].length != b.length)
            return null;
        double[] res = new double[A.length];
        for (int i = 0; i < A.length; i ++) {
            double temp = 0.0;
            for (int j = 0; j < A[0].length; j++)
                temp = temp + 1.0 * A[i][j] * b[j];
            res[i] = temp;
        }
        return res;
    }

//    public static double[] mutiply(double[][] A, double[][] B){
//        if ()
//    }

    public static double[] mutiply(double[] b, double[][] A){
        if (b.length != A.length)
            return null;
        double[] res = new double[A[0].length];
        for (int j = 0; j < A[0].length; j ++) {
            double temp = 0.0;
            for (int i = 0; i < A.length; i++)
                temp = temp + 1.0 * b[i] * A[i][j];
            res[j] = temp;
        }
        return res;
    }

    public static double[] subtract(double[] a, double[] b){
        if (a.length != b.length)
            return null;
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i ++)
            res[i] = a[i] - b[i];
        return res;
    }

    public static double mutiply(double[] a, double[] b){
        if (a.length != b.length)
            return 0;
        double res = 0.0;
        for (int i = 0; i < a.length; i ++)
            res += 1.0 * a[i] * b[i];
        return res;
    }

    public static double[] mutiply(double b,double[] a){
        double[] res = new double[a.length];
        for(int i = 0; i < a.length; i ++)
            res[i] = 1.0 * a[i] * b;
        return res;
    }

    public static double[] add(double[] a, double[] b){
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i ++)
            res[i] = a[i] + b[i];
        return res;
    }

    public static double abs(double[] a){
        double res = 0;
        for (int i = 0; i < a.length; i ++)
            res += 1.0 * a[i] * a[i];
        return Math.sqrt(res);
    }
}
