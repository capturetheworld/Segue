.class public TestProcedure
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static i I
.field private static j I
.field private static p Z
.field private static x F
.field private static y F

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	TestProcedure/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this LTestProcedure;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; PROCEDURE alpha
;
.method private static alpha(IIFIIFFZ)V

.var 8 is a F
.var 9 is b F
.var 10 is c F
.var 11 is i I
.var 3 is k I
.var 0 is m I
.var 1 is n I
.var 4 is o I
.var 7 is q Z
.var 2 is r F
.var 5 is w F
.var 6 is z F
;
; 015 a:=1
;
	iconst_1
	i2f
	fstore	8
;
; 015 b:=2
;
	iconst_2
	i2f
	fstore	9
;
; 016 c:=a*b-w/z
;
	fload	8
	fload	9
	fmul
	fload	5
	fload	6
	fdiv
	fsub
	fstore	10
;
; 018 i:=3
;
	iconst_3
	istore	11
;
; 019 k:=k+i+j+n
;
	iload_3
	iload	11
	iadd
	getstatic	TestProcedure/j I
	iadd
	iload_1
	iadd
	istore_3
;
; 020 q:=notpor(i=j)and(w>2)and(w/z=1.5)
;
	getstatic	TestProcedure/p Z
	iconst_1
	ixor
	iload	11
	getstatic	TestProcedure/j I
	if_icmpeq	L001
	iconst_0
	goto	L002
L001:
	iconst_1
L002:
	fload	5
	iconst_2
	i2f
	fcmpg
	ifgt	L003
	iconst_0
	goto	L004
L003:
	iconst_1
L004:
	iand
	fload	5
	fload	6
	fdiv
	ldc	1.5
	fcmpg
	ifeq	L005
	iconst_0
	goto	L006
L005:
	iconst_1
L006:
	iand
	ior
	istore	7
;
; 021 z:=r
;
	fload_2
	fstore	6
;
; 023 writeln('alpha parms:  m = ',m,', n = ',n,', r = ',r:4:2,', k = ',k, ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"alpha parms:  m = %d, n = %d, r = %4.2f, k = %d, o = %d, w = %4.2f, z = %4.2f, q = %b\n"
	bipush	8
	anewarray	java/lang/Object
	dup
	iconst_0
	iload_0
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	iload_1
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	fload_2
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	iload_3
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_4
	iload	4
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_5
	fload	5
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	bipush	6
	fload	6
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	bipush	7
	iload	7
	invokestatic	java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 026 writeln('alpha locals: a = ',a:4:2,', b = ',b:4:2,', c = ',c:4:2,',  ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"alpha locals: a = %4.2f, b = %4.2f, c = %4.2f, i = %d\n"
	iconst_4
	anewarray	java/lang/Object
	dup
	iconst_0
	fload	8
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_1
	fload	9
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_2
	fload	10
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	iload	11
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 12
.limit stack 6
.end method

;
; PROCEDURE beta
;
.method private static beta()V

.var 0 is i F
.var 1 is j F
;
; 035 i:=22
;
	bipush	22
	i2f
	fstore_0
;
; 035 j:=44
;
	bipush	44
	i2f
	fstore_1
;
; 036 writeln('beta locals:  Hello, world! ',i+j:4:2)
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"beta locals:  Hello, world! %4.2f\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	fload_0
	fload_1
	fadd
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 2
.limit stack 7
.end method

;
; PROCEDURE gamma
;
.method private static gamma(IIFF)V

.var 4 is a F
.var 5 is b F
.var 6 is c F
.var 0 is i I
.var 1 is n I
.var 3 is r F
.var 2 is x F
;
; 044 a:=i+n
;
	iload_0
	iload_1
	iadd
	i2f
	fstore	4
;
; 045 b:=i*x+r
;
	iload_0
	i2f
	fload_2
	fmul
	fload_3
	fadd
	fstore	5
;
; 046 c:=i
;
	iload_0
	i2f
	fstore	6
;
; 047 i:=i+n
;
	iload_0
	iload_1
	iadd
	istore_0
;
; 049 writeln('gamma parms:  i = ',i,', n = ',n,', x = ',x:4:2,', r = ',r: ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"gamma parms:  i = %d, n = %d, x = %4.2f, r = %4.2f\n"
	iconst_4
	anewarray	java/lang/Object
	dup
	iconst_0
	iload_0
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	iload_1
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	fload_2
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	fload_3
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 050 writeln('gamma locals: a = ',a:4:2,', b = ',b:4:2,', c = ',c:4:2)
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"gamma locals: a = %4.2f, b = %4.2f, c = %4.2f\n"
	iconst_3
	anewarray	java/lang/Object
	dup
	iconst_0
	fload	4
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_1
	fload	5
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_2
	fload	6
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 7
.limit stack 6
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
; 056 i:=5
;
	iconst_5
	putstatic	TestProcedure/i I
;
; 056 j:=7
;
	bipush	7
	putstatic	TestProcedure/j I
;
; 057 x:=3
;
	iconst_3
	i2f
	putstatic	TestProcedure/x F
;
; 057 y:=2
;
	iconst_2
	i2f
	putstatic	TestProcedure/y F
;
; 058 p:=false
;
	iconst_0
	putstatic	TestProcedure/p Z
;
; 059 writeln('main:         i = ',i,', j = ',j,', x = ',x:4:2,', y = ',y: ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n"
	iconst_5
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestProcedure/i I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	getstatic	TestProcedure/j I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	getstatic	TestProcedure/x F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	getstatic	TestProcedure/y F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_4
	getstatic	TestProcedure/p Z
	invokestatic	java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 061 alpha(6,i-3,x+y/i,i,j,x,y,p)
;
	bipush	6
	getstatic	TestProcedure/i I
	iconst_3
	isub
	getstatic	TestProcedure/x F
	getstatic	TestProcedure/y F
	getstatic	TestProcedure/i I
	i2f
	fdiv
	fadd
	getstatic	TestProcedure/i I
	getstatic	TestProcedure/j I
	getstatic	TestProcedure/x F
	getstatic	TestProcedure/y F
	getstatic	TestProcedure/p Z
	invokestatic	TestProcedure/alpha(IIFIIFFZ)V
;
; 066 writeln('main:         i = ',i,', j = ',j,', x = ',x:4:2,', y = ',y: ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n"
	iconst_5
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestProcedure/i I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	getstatic	TestProcedure/j I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	getstatic	TestProcedure/x F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	getstatic	TestProcedure/y F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_4
	getstatic	TestProcedure/p Z
	invokestatic	java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 068 beta()
;
	invokestatic	TestProcedure/beta()V
;
; 069 writeln('main:         i = ',i,', j = ',j,', x = ',x:4:2,', y = ',y: ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n"
	iconst_5
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestProcedure/i I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	getstatic	TestProcedure/j I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	getstatic	TestProcedure/x F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	getstatic	TestProcedure/y F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_4
	getstatic	TestProcedure/p Z
	invokestatic	java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 071 gamma(i,j,i/x,i*j)
;
	getstatic	TestProcedure/i I
	getstatic	TestProcedure/j I
	getstatic	TestProcedure/i I
	i2f
	getstatic	TestProcedure/x F
	fdiv
	getstatic	TestProcedure/i I
	getstatic	TestProcedure/j I
	imul
	invokestatic	TestProcedure/gamma(IIFF)V
;
; 073 writeln('main:         i = ',i,', j = ',j,', x = ',x:4:2,', y = ',y: ...
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"main:         i = %d, j = %d, x = %4.2f, y = %4.2f, p = %b\n"
	iconst_5
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	TestProcedure/i I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	getstatic	TestProcedure/j I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_2
	getstatic	TestProcedure/x F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_3
	getstatic	TestProcedure/y F
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	dup
	iconst_4
	getstatic	TestProcedure/p Z
	invokestatic	java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

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
