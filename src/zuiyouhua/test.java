package zuiyouhua;

public class test {
    public static void main(String[] args){
        double[][] a = {{1,2},{3,4}};
        double[][] b = new double[a.length][a[0].length];

        b[0][0] = 0;
        System.out.println(a[0][0]);
        System.out.println(b[0][0]);
    }
}
