.class public test_txt
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static a1 D
.field private static a2 D
.field private static b1 D
.field private static b2 D

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	test_txt/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this Ltest_txt;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; FUNCTION squareroot
;
.method private static squareroot(D)D

.var 6 is e D
.var 0 is n D
.var 2 is x D
.var 4 is y D
	dload_0
	dstore_2
	dconst_1
	dstore	4
	ldc	1.0E-6
	f2d
	dstore	6
L001:
	dload_2
	dload	4
	dsub
	dload	6
	dcmpg
	ifgt	L003
	goto	L004
L003:
	iconst_1
	goto	L005
L004:
	iconst_0
	goto	L005
L005:
	ifeq	L002
	dload_2
	dload	4
	dadd
	ldc	2.0
	f2d
	ddiv
	dstore_2
	dload_0
	dload_2
	ddiv
	dstore	4
	goto	L001
L002:
	dload_2
	dreturn

	return

.limit locals 12
.limit stack 32
.end method

;
; FUNCTION slope
;
.method private static slope(DDDD)D

.var 0 is x1 D
.var 2 is x2 D
.var 4 is y1 D
.var 6 is y2 D
	dload	6
	dload	4
	dsub
	dload_2
	dload_0
	dsub
	ddiv
	dreturn

	return

.limit locals 12
.limit stack 32
.end method

;
; FUNCTION trianglearea
;
.method private static trianglearea(DD)D

.var 0 is base D
.var 2 is height D
	ldc	0.5
	f2d
	dload_0
	dmul
	dload_2
	dmul
	dreturn

	return

.limit locals 8
.limit stack 32
.end method

;
; FUNCTION trapezoidarea
;
.method private static trapezoidarea(DDD)D

.var 0 is base1 D
.var 2 is base2 D
.var 4 is height D
	ldc	0.5
	f2d
	dload_0
	dload_2
	dadd
	dmul
	dload	4
	dmul
	dreturn

	return

.limit locals 10
.limit stack 32
.end method

;
; FUNCTION circlearea
;
.method private static circlearea(D)D

.var 0 is radius D
	ldc	3.14159265358979
	f2d
	dload_0
	dload_0
	dmul
	dmul
	dreturn

	return

.limit locals 6
.limit stack 32
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

	ldc	3.0
	f2d
	putstatic	test_txt/a1 D
	ldc	6.0
	f2d
	putstatic	test_txt/a2 D
	ldc	9.22
	f2d
	putstatic	test_txt/b1 D
	ldc	7.1
	f2d
	putstatic	test_txt/b2 D
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	test_txt/a1 D
	getstatic	test_txt/a2 D
	getstatic	test_txt/b1 D
	getstatic	test_txt/b2 D
	invokestatic	test_txt/slope(DDDD)D
	invokevirtual	java/io/PrintStream.println(D)V
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	test_txt/a2 D
	getstatic	test_txt/a1 D
	invokestatic	test_txt/trianglearea(DD)D
	invokevirtual	java/io/PrintStream.println(D)V
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	test_txt/a2 D
	getstatic	test_txt/a1 D
	getstatic	test_txt/a1 D
	invokestatic	test_txt/trapezoidarea(DDD)D
	invokevirtual	java/io/PrintStream.println(D)V
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	test_txt/b1 D
	invokestatic	test_txt/circlearea(D)D
	invokevirtual	java/io/PrintStream.println(D)V
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	8.192739812E9
	f2d
	invokestatic	test_txt/squareroot(D)D
	invokevirtual	java/io/PrintStream.println(D)V

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
.limit stack 32
.end method
