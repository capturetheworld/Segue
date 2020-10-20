public class TestFor
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int i;
    private static int j;
    private static char ch;

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        
        for(int i = 1; i <= 5; i++) System.out.printf("i = %d\n", 
                                                      i);
        System.out.println();
        
        for(int i = 1; i <= 3; i++) {
            
            for(int j = 4; j >= 1; j--) {
                System.out.printf("i = %d, j = %d\n", i, j);
            }
        }
        System.out.println();
        
        for(int ch = 'a'; ch <= 'z'; ch++) System.out.printf("%c", 
                                                             ch);
        System.out.println();
        
        for(int ch = 'Z'; ch >= 'A'; ch--) System.out.printf("%c", 
                                                             ch);
        System.out.println();

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
