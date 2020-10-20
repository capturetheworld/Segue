public class TestIf
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int i;
    private static int j;
    private static int k;
    private static double x;
    private static double y;
    private static boolean p;
    private static boolean q;
    private static String str;
    private static String txt;

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        i = 1;
        j = 2;
        
        if (i == j)
        {
            x = 3.14;
        }
        else
        {
            x = -5;
        }
        
        if (i != j)
        {
            y = 3.14;
        }
        else
        {
            y = -5;
        }
        System.out.printf("i = %d, j = %d, x = %5.2f, y = %5.2f\n", 
                          i, j, x, y);
        
        if (i == j)
        {
            {
                x = -7;
            }
        }
        else
        {
            {
                x = 8;
            }
        }
        
        if (i != j)
        {
            {
                y = 14;
            }
        }
        else
        {
            {
                y = -2;
            }
        }
        System.out.printf("i = %d, j = %d, x = %5.2f, y = %5.2f\n", 
                          i, j, x, y);
        p = i == j;
        
        if (p)
        {
            x = 55.55;
        }
        else
        {
            {
                x = 77.77;
                y = 88.88;
            }
        }
        System.out.printf("i = %d, j = %d, x = %5.2f, y = %5.2f\n", 
                          i, j, x, y);
        q = i <= j;
        k = 10;
        
        if (p)
        {
            i = 33;
        }
        else
        {
            
            if (!q)
            {
                i = 44;
            }
            else
            {
                
                if (i == j)
                {
                    i = 55;
                }
                else
                {
                    i = 6;
                }
            }
        }
        
        if (!p)
        {
            
            if (q)
            {
                j = 9;
            }
            else
            {
                j = -9;
            }
        }
        
        if (p)
        {
            
            if (q)
            {
                k = 11;
            }
            else
            {
                k = 12;
            }
        }
        System.out.printf("i = %d, j = %d, x = %5.2f, y = %5.2f\n", 
                          i, j, x, y);
        System.out.printf("k = %d\n", k);
        System.out.println();
        
        if (!p && q && (i != j) && (x < y))
        {
            System.out.printf("Good-bye");
        }
        
        if (!p)
        {
            
            if (q)
            {
                
                if (i != j)
                {
                    
                    if (x < y)
                    {
                        System.out.printf(", world!\n");
                    }
                }
            }
        }

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
