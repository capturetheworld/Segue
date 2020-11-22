.class public Newton3
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static number I

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	Newton3/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this LNewton3;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; FUNCTION root
;
.method private static root(F)F

.var 3 is diff F
.var 2 is prev F
.var 1 is r F
.var 4 is root F
.var 0 is x F
;
; 011 r:=1
;
	iconst_1
	i2f
	fstore_1
;
; 012 prev:=0
;
	iconst_0
	i2f
	fstore_2
;
; 014 REPEATr:=(x/r+r)/2;diff:=r-prev;IFdiff<0THENdiff:=-diff;prev:=rUNTIL ...
;
L001:
;
; 015 r:=(x/r+r)/2
;
	fload_0
	fload_1
	fdiv
	fload_1
	fadd
	iconst_2
	i2f
	fdiv
	fstore_1
;
; 016 diff:=r-prev
;
	fload_1
	fload_2
	fsub
	fstore_3
;
; 017 IFdiff<0THENdiff:=-diff
;
	fload_3
	iconst_0
	i2f
	fcmpg
	iflt	L004
	iconst_0
	goto	L005
L004:
	iconst_1
L005:
	ifeq	L003
;
; 017 diff:=-diff
;
	fload_3
	fneg
	fstore_3
L003:
;
; 018 prev:=r
;
	fload_1
	fstore_2
	fload_3
	ldc	1.000000013351432E-10
	fcmpg
	iflt	L006
	iconst_0
	goto	L007
L006:
	iconst_1
L007:
	ifne	L002
	goto	L001
L002:
;
; 021 root:=r
;
	fload_1
	fstore	4

	fload	4
	freturn

.limit locals 5
.limit stack 2
.end method

;
; PROCEDURE print
;
.method private static print(IF)V

.var 0 is n I
.var 1 is root F
;
; 026 writeln('The square root of ',n:4,' is ',root:8:4)
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"The square root of %4d is %8.4f\n"
	iconst_2
	anewarray	java/lang/Object
	dup
	iconst_0
	iload_0
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	dup
	iconst_1
	fload_1
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 2
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
; 030 FORnumber:=1TO25DOBEGINprint(number,root(number))END
;
	iconst_1
	putstatic	Newton3/number I
L008:
	getstatic	Newton3/number I
	bipush	25
	if_icmpgt	L009
;
; 031 print(number,root(number))
;
	getstatic	Newton3/number I
	getstatic	Newton3/number I
	invokestatic	Newton3/root(F)F
	invokestatic	Newton3/print(IF)V
	getstatic	Newton3/number I
	iconst_1
	iadd
	putstatic	Newton3/number I
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
