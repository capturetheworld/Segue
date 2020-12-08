.class public test_txt
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static m D
.field private static n D

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
; MAIN
;
.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String;
.var 1 is _start Ljava/time/Instant;
.var 2 is _end Ljava/time/Instant;
.var 3 is _elapsed J

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_1

	ldc	9.0
	f2d
	putstatic	test_txt/n D
	ldc	15.0
	f2d
	putstatic	test_txt/m D
L001:
	getstatic	test_txt/n D
	getstatic	test_txt/m D
	dcmpg
	ifge	L003
L003:
	iconst_1
	goto	L005
L004:
	iconst_0
	goto	L005
L005:
	ifeq	L002
	getstatic	test_txt/n D
	dconst_1
	dadd
	putstatic	test_txt/n D
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	test_txt/n D
	invokevirtual	java/io/PrintStream.println(D)V
	goto	L001
L002:

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

.limit locals 10
.limit stack 32
.end method
