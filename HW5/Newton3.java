public class Newton3
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int number;

    static double root(double x)
    {
        double root;

        double r;
        double prev;
        double diff;

        r = 1;
        prev = 0;
        do
        {
            r = (x/r + r)/2;
            diff = r - prev;
            
            if (diff < 0)
            {
                diff = -diff;
            }
            prev = r;
        }
        while (!(diff < 1.0e-10));
        root = r;

        return root;
    }

    static void print(int n, double root)
    {

        System.out.printf("The square root of %4d is %8.4f\n", 
                          n, root);
    }

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        
        for(number = 1; number <= 25; number++) {
            
            print(number, root(number));
        }

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
