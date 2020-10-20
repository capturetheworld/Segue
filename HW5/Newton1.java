public class Newton1
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int number;
    private static double root;
    private static double prev;
    private static double diff;

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        
        for(int number = 1; number <= 25; number++) {
            System.out.println();
            System.out.printf("Square root of %d\n", number);
            System.out.println();
            root = 1;
            prev = 0;
            do
            {
                root = (number/root + root)/2;
                diff = root - prev;
                
                if (diff < 0)
                {
                    diff = -diff;
                }
                prev = root;
                System.out.printf("%24.10f\n", root);
            }
            while (!(diff < 1.0e-10));
        }

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
