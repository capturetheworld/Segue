.class public TestCase
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static ch C
.field private static even I
.field private static i I
.field private static j I
.field private static odd I
.field private static prime I
.field private static str C

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	TestCase/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this LTestCase;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; MAIN
;
.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String;
.var 1 is _start Ljava/time/Instant;
.var 2 is _end Ljava/time/Instant;
.var 3 is _elapsed J

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_1

;
; 008 i:=3
;
	iconst_3
	putstatic	TestCase/i I
;
; 008 ch:='b'
;
	bipush	98
	putstatic	TestCase/ch C
;
; 009 even:=-990
;
	sipush	990
	ineg
	putstatic	TestCase/even I
;
; 009 odd:=-999
;
	sipush	999
	ineg
	putstatic	TestCase/odd I
;
; 009 prime:=0
;
	iconst_0
	putstatic	TestCase/prime I
;
; 011 CASEi+1OF1:j:=i;-8:j:=8*i;5,7,4:j:=574*i;END
;
	getstatic	TestCase/i I
	iconst_1
	iadd
	lookupswitch
	  -8: L002
	  1: L001
	  4: L003
	  5: L003
	  7: L003
	  default: L004
L001:
;
; 012 j:=i
;
	getstatic	TestCase/i I
	putstatic	TestCase/j I
L002:
;
; 013 j:=8*i
;
	bipush	8
	getstatic	TestCase/i I
	imul
	putstatic	TestCase/j I
L003:
;
; 014 j:=574*i
;
	sipush	574
	getstatic	TestCase/i I
	imul
	putstatic	TestCase/j I
L004:
;
; 017 writeln('j = ',j)
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"j = %d\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestCase/j I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 019 CASEchOF'c','b':str:='p';'a':str:='q'END
;
	getstatic	TestCase/ch C
	lookupswitch
	  97: L006
	  98: L005
	  99: L005
	  default: L007
L005:
;
; 020 str:='p'
;
	bipush	112
	putstatic	TestCase/str C
L006:
;
; 021 str:='q'
;
	bipush	113
	putstatic	TestCase/str C
L007:
;
; 024 writeln('str = ''',str,'''')
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"str = '%c'\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestCase/str C
	invokestatic	java/lang/Character/valueOf(C)Ljava/lang/Character;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 026 FORi:=-5TO15DOBEGINCASEiOF2:prime:=i;-4,-2,0,4,6,8,10,12:even:=i;-3, ...
;
	iconst_5
	ineg
	putstatic	TestCase/i I
L008:
	getstatic	TestCase/i I
	bipush	15
	if_icmpgt	L009
;
; 027 CASEiOF2:prime:=i;-4,-2,0,4,6,8,10,12:even:=i;-3,-1,1,3,5,7,9,11:CAS ...
;
	getstatic	TestCase/i I
	lookupswitch
	  -4: L011
	  -3: L012
	  -2: L011
	  -1: L012
	  0: L011
	  1: L012
	  2: L010
	  3: L012
	  4: L011
	  5: L012
	  6: L011
	  7: L012
	  8: L011
	  9: L012
	  10: L011
	  11: L012
	  12: L011
	  default: L013
L010:
;
; 028 prime:=i
;
	getstatic	TestCase/i I
	putstatic	TestCase/prime I
L011:
;
; 029 even:=i
;
	getstatic	TestCase/i I
	putstatic	TestCase/even I
L012:
;
; 030 CASEiOF-3,-1,1,9:odd:=i;2,3,5,7,11:prime:=i;END
;
	getstatic	TestCase/i I
	lookupswitch
	  -3: L014
	  -1: L014
	  1: L014
	  2: L015
	  3: L015
	  5: L015
	  7: L015
	  9: L014
	  11: L015
	  default: L016
L014:
;
; 031 odd:=i
;
	getstatic	TestCase/i I
	putstatic	TestCase/odd I
L015:
;
; 032 prime:=i
;
	getstatic	TestCase/i I
	putstatic	TestCase/prime I
L016:
L013:
;
; 036 writeln('i = ',i,', even = ',even,', odd = ',odd,', prime = ',prime)
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"i = %d, even = %d, odd = %d, prime = %d\n"
	iconst_4
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestCase/i I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	getstatic	TestCase/even I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	getstatic	TestCase/odd I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_3
	getstatic	TestCase/prime I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
	getstatic	TestCase/i I
	iconst_1
	iadd
	putstatic	TestCase/i I
	goto	L008
L009:

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_2
	aload_1
	aload_2
	invokestatic	java/time/Duration/between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
	invokevirtual	java/time/Duration/toMillis()J
	lstore_3
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"\n[%,d milliseconds execution time.]\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	lload_3
	invokestatic	java/lang/Long/valueOf(J)Ljava/lang/Long;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 6
.limit stack 7
.end method
