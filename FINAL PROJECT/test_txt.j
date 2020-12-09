.class public test_txt
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static c D
.field private static factor D
.field private static firsttime D
.field private static fn D
.field private static fourthf D
.field private static freq D
.field private static i D
.field private static initf D
.field private static j D
.field private static n D
.field private static secondf D
.field private static secondtime D
.field private static thirdf D
.field private static thirdtime D
.field private static volume1 D
.field private static volume2 D

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

	ldc	40.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.setSlotDuration(D)V
	dconst_0
	putstatic	test_txt/c D
L001:
	getstatic	test_txt/c D
	ldc	30.0
	f2d
	dcmpg
	iflt	L003
	goto	L004
L003:
	iconst_1
	goto	L005
L004:
	iconst_0
	goto	L005
L005:
	ifeq	L002
	getstatic	test_txt/c D
	d2i
	ldc	3.0
	f2d
	d2i
	invokestatic	com/cs153/synthesizer/Synthesizer.setChannelType(II)V
	getstatic	test_txt/c D
	dconst_1
	dadd
	putstatic	test_txt/c D
	goto	L001
L002:
	ldc	38.0
	f2d
	putstatic	test_txt/n D
	dconst_0
	putstatic	test_txt/i D
	dconst_0
	putstatic	test_txt/c D
L006:
	getstatic	test_txt/i D
	ldc	6.0
	f2d
	dcmpg
	iflt	L008
	goto	L009
L008:
	iconst_1
	goto	L010
L009:
	iconst_0
	goto	L010
L010:
	ifeq	L007
	dconst_0
	putstatic	test_txt/j D
L011:
	getstatic	test_txt/j D
	ldc	5.0
	f2d
	dcmpg
	iflt	L013
	goto	L014
L013:
	iconst_1
	goto	L015
L014:
	iconst_0
	goto	L015
L015:
	ifeq	L012
	getstatic	test_txt/n D
	invokestatic	java/lang/Math.random()D
	ldc	0.3
	f2d
	dmul
	ldc	0.15
	f2d
	dsub
	dadd
	putstatic	test_txt/fn D
	dconst_1
	getstatic	test_txt/n D
	ldc	38.0
	f2d
	dsub
	ldc	58.0
	f2d
	ddiv
	dsub
	putstatic	test_txt/factor D
	getstatic	test_txt/factor D
	dconst_0
	dcmpg
	ifle	L017
	goto	L018
L017:
	iconst_1
	goto	L019
L018:
	iconst_0
	goto	L019
L019:
	ifeq	L016
	ldc	1.0E-4
	f2d
	putstatic	test_txt/factor D
L016:
	ldc	0.01
	f2d
	ldc	0.05
	f2d
	getstatic	test_txt/factor D
	dmul
	dadd
	putstatic	test_txt/volume1 D
	ldc	0.01
	f2d
	ldc	0.13
	f2d
	getstatic	test_txt/factor D
	dmul
	dadd
	putstatic	test_txt/volume2 D
	invokestatic	java/lang/Math.random()D
	ldc	50.0
	f2d
	dmul
	ldc	175.0
	f2d
	dadd
	putstatic	test_txt/initf D
	invokestatic	java/lang/Math.random()D
	ldc	100.0
	f2d
	dmul
	ldc	150.0
	f2d
	dadd
	putstatic	test_txt/secondf D
	invokestatic	java/lang/Math.random()D
	ldc	100.0
	f2d
	dmul
	ldc	150.0
	f2d
	dadd
	putstatic	test_txt/thirdf D
	ldc	27.5
	f2d
	getstatic	test_txt/fn D
	ldc	21.0
	f2d
	dsub
	ldc	12.0
	f2d
	ddiv
	dmul
	getstatic	test_txt/fn D
	ldc	21.0
	f2d
	dsub
	ldc	12.0
	f2d
	ddiv
	dmul
	putstatic	test_txt/freq D
	ldc	0.8
	f2d
	getstatic	test_txt/thirdf D
	dmul
	ldc	0.2
	f2d
	getstatic	test_txt/freq D
	dmul
	dadd
	putstatic	test_txt/fourthf D
	invokestatic	java/lang/Math.random()D
	ldc	40.0
	f2d
	dmul
	ldc	10.0
	f2d
	dadd
	putstatic	test_txt/firsttime D
	invokestatic	java/lang/Math.random()D
	ldc	20.0
	f2d
	dmul
	ldc	5.0
	f2d
	dadd
	putstatic	test_txt/secondtime D
	ldc	100.0
	f2d
	getstatic	test_txt/firsttime D
	dsub
	getstatic	test_txt/secondtime D
	dsub
	putstatic	test_txt/thirdtime D
	getstatic	test_txt/c D
	d2i
	ldc	0.01
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/initf D
	invokevirtual	com/cs153/synthesizer/Note.frequency(D)Lcom/cs153/synthesizer/Note;
	dconst_0
	invokevirtual	com/cs153/synthesizer/Note.volume(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	ldc	5.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/volume1 D
	invokevirtual	com/cs153/synthesizer/Note.lerpVolume(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	getstatic	test_txt/firsttime D
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/secondf D
	invokevirtual	com/cs153/synthesizer/Note.lerpFrequency(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	getstatic	test_txt/secondtime D
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	getstatic	test_txt/thirdtime D
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/thirdf D
	invokevirtual	com/cs153/synthesizer/Note.lerpFrequency(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	ldc	50.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/fourthf D
	invokevirtual	com/cs153/synthesizer/Note.lerpFrequency(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	ldc	100.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/fn D
	invokevirtual	com/cs153/synthesizer/Note.lerpMidiNote(D)Lcom/cs153/synthesizer/Note;
	getstatic	test_txt/volume2 D
	invokevirtual	com/cs153/synthesizer/Note.lerpVolume(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	ldc	100.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	d2i
	ldc	30.0
	f2d
	invokestatic	com/cs153/synthesizer/Synthesizer.play(ID)Lcom/cs153/synthesizer/Note;
	dconst_0
	invokevirtual	com/cs153/synthesizer/Note.lerpVolume(D)Lcom/cs153/synthesizer/Note;
	pop
	getstatic	test_txt/c D
	dconst_1
	dadd
	putstatic	test_txt/c D
	getstatic	test_txt/j D
	dconst_1
	dadd
	putstatic	test_txt/j D
	goto	L011
L012:
	getstatic	test_txt/n D
	ldc	12.0
	f2d
	dadd
	putstatic	test_txt/n D
	getstatic	test_txt/i D
	dconst_1
	dadd
	putstatic	test_txt/i D
	goto	L006
L007:
	iconst_0
	invokestatic	com/cs153/synthesizer/Synthesizer.start(Z)V

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
