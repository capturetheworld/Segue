public class TestProcedure
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int i;
    private static int j;
    private static double x;
    private static double y;
    private static boolean p;

    static void alpha(int m, int n, double r, int k, int o, double w, 
                      double z, boolean q)
    {
        double a;
        double b;
        double c;
        int i;

        a = 1;
        b = 2;
        c = a*b - w/z;
        i = 3;
        k = k + i + j + n;
        q = !p || (i == j) && (w > 2) && (w/z == 1.5);
        z = r;
        System.out.printf("alpha parms:  m = %d, n = %d, r = %4.2f, k = %d, o = %d, w = %4.2f, z = %4.2f, q = %b\n", 
                          m, n, r, k, o, w, z, q);
        System.out.printf("alpha locals: a = %4.2f, b = %4.2f, c = %4.2f, i = %d\n", 
                          a, b, c, i);
    }

    static void beta()
    {
        double i;
        double j;

        i = 22;
        j = 44;
        System.out.printf("beta locals:  Hello, world! %4.2f\n", 
                          i + j);
    }

    static void gamma(int i, int n, double x, double r)
    {
        double a;
        double b;
        double c;

        a = i + n;
        b = i*x + r;
        c = i;
        i = i + n;
        System.out.printf("gamma parms:  i = %d, n = %d, x = %4.2f, r = %4.2f\n", 
                          i, n, x, r);
        System.out.printf("gamma locals: a = %4.2f, b = %4.2f, c = %4.2f\n", 
                          a, b, c);
    }

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        i = 5;
        j = 7;
        x = 3;
        y = 2;
        p = false;
        System.out.printf("main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n", 
                          i, j, x, y, p);
        
        public static void
        System.out.printf("main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n", 
                          i, j, x, y, p);
        
        public static void
        System.out.printf("main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n", 
                          i, j, x, y, p);
        
        public static void
        System.out.printf("main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n", 
                          i, j, x, y, p);

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
