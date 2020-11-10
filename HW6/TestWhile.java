public class TestWhile
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int i;
    private static int j;

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        i = 1;
        while (i <= 5) 
        {
            System.out.printf("i = %d\n", i);
            i = i + 1;
        }
        System.out.println();
        i = 1;
        while (i <= 5) 
        {
            j = 10;
            while (j <= 30) 
            {
                System.out.printf("i = %d, j = %d\n", i, j);
                j = j + 10;
            }
            i = i + 1;
        }

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
