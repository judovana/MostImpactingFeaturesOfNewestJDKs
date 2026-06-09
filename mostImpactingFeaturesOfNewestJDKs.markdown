#    Most Impacting Features Of Newest JDKs
###    Based on the survey of 242 replies

By Jiri Vanek from IBM's OpenJDK team.
19/6/2026 Devconnf 2026, Brno

Where the answers moreover caused renaming....

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
#    Most Expected Features Of Newest JDKs

By Jiri Vanek from IBM's OpenJDK team.
19/6/2026 Devconnf 2026, Brno

Only 7.5 JEPs made it to this talk, you can see the remaining 59 (34 - many are made in iterations)) at Brno JUG recording: https://www.youtube.com/watch?v=UnA2jRVNb3M (3hours!)

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Survey results
454: Foreign Function & Memory API			(31)
**********************
483: Ahead-of-Time Class Loading & Linking	(29)
**************
485: Stream Gatherers						(20)
************
513: Flexible Constructor Bodies			(16)
**********
529: Vector API (Eleventh Incubator)		(15)
**********
519: Compact Object Headers					(14)
**********
459: String Templates (Second Preview)		(14)
********
484: Class-File API							(12)
********
506: Scoped Values							(11)
********
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# What did not fit:
458: Launch Multi-File Source-Code Programs	(8)
******
502: Stable Values (Preview)				(7)(!)
******
500: Prepare to Make Final Mean Final		(7)
******
531: Lazy Constants (Third Preview)			(6)(!)
******
532: Primitive Types in Patterns, instanceof, and switch (Fifth Preview)
******
456: Unnamed Variables & Patterns			(6)
****
474: ZGC: Generational Mode by Default		(4)
****
477: Implicitly Declared Classes and Instance Main Methods (Third Preview)
****
495: Simple Source Files and Instance Main Methods (Fourth Preview)
****
512: Compact Source Files and Instance Main Methods
****
515: Ahead-of-Time Method Profiling			(4)
****
525: Structured Concurrency (Sixth Preview)	(3)
****
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# What was not exactly in favor: 
(vote or two)
467: Markdown Documentation Comments
471: Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal
475: Late Barrier Expansion for G1
479: Remove the Windows 32-bit x86 Port
486: Permanently Disable the Security Manager
491: Synchronize Virtual Threads without Pinning
493: Linking Run-Time Images without JMODs
496: Quantum-Resistant Module-Lattice-Based Key Encapsulation Mechanism
497: Quantum-Resistant Module-Lattice-Based Digital Signature Algorithm
514: Ahead-of-Time Command-Line Ergonomics
423: Region Pinning for G1
509: JFR CPU-Time Profiling (Experimental)
516: Ahead-of-Time Object Caching with Any GC
517: HTTP/3 for the HTTP Client API
522: G1 GC: Improve Throughput by Reducing Synchronization
520: JFR Method Timing & Tracing
521: Generational Shenandoah
527: Post-Quantum Hybrid Key Exchange for TLS 1.3
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# no votes at all!
472: Prepare to Restrict the Use of JNI
490: ZGC: Remove the Non-Generational Mode
498: Warn upon Use of Memory-Access Methods in sun.misc.Unsafe
501: Deprecate the 32-bit x86 Port for Removal
503: Remove the 32-bit x86 Port
504: Remove the Applet API
518: JFR Cooperative Sampling
510: Key Derivation Function API
511: Module Import Declarations
524: PEM Encodings of Cryptographic Objects (Second Preview)
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Scientists finally found what people want to hear, but they changed mind
454: Foreign Function & Memory API
 * huge surprised
 * Maybe because it was first question in the form?
   * Or very specific form audience?
483: Ahead-of-Time Class Loading & Linking:
 * at least some parts of it
 * Topic of itself:  https://www.youtube.com/watch?v=UnA2jRVNb3M&t=7237s
Big language improvements:
 * 485: Stream Gatherers
 * 531: Lazy Constants (Third Preview)
 * 484: Class-File API
 * 513: Flexible Constructor Bodies
 * 529: Vector API (Eleventh Incubator)
 * 519: Compact Object Headers
   * VM feature
 * 459: String Templates (Second Preview)
 * 506: Scoped Values
 * 458: Launch Multi-File Source-Code Programs
 * 502: Stable Values (Preview)
 * 500: Prepare to Make Final Mean Final
 * 532:	Primitive Types in Patterns, instanceof, and switch (Fifth Preview)
 * 456: Unnamed Variables & Patterns
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# .. and what they do not care so much 1/4
small language changes:
 * 477: Implicitly Declared Classes and Instance Main Methods (Third Preview)
 * 495: Simple Source Files and Instance Main Methods (Fourth Preview)
 * 512: Compact Source Files and Instance Main Methods
 * !! 515: Ahead-of-Time Method Profiling
 * !! 514: Ahead-of-Time Command-Line Ergonomics
 * ?? 525: Structured Concurrency (Sixth Preview)
 * 467: Markdown Documentation Comments
 * 511: Module Import Declarations
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# .. and what they do not care so much 2/4
internal VM features:
 * 474: ZGC: Generational Mode by Default
 * 475: Late Barrier Expansion for G1
 * 491: Synchronize Virtual Threads without Pinning
 * 493: Linking Run-Time Images without JMODs
 * 423: Region Pinning for G1
 * 516: Ahead-of-Time Object Caching with Any GC
 * 522: G1 GC: Improve Throughput by Reducing Synchronization
 * 521: Generational Shenandoah
 * 490: ZGC: Remove the Non-Generational Mode
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# .. and what they do not care so much 3/4
removals:
 * 471: Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal
 * 479: Remove the Windows 32-bit x86 Port
 * 486: Permanently Disable the Security Manager
 * 498: Warn upon Use of Memory-Access Methods in sun.misc.Unsafe
 * 501: Deprecate the 32-bit x86 Port for Removal
 * 503: Remove the 32-bit x86 Port
 * 504: Remove the Applet API
 * 472: Prepare to Restrict the Use of JNI
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# .. and what they do not care so much 4/4
Crypto:
 * 496: Quantum-Resistant Module-Lattice-Based Key Encapsulation Mechanism
 * 497: Quantum-Resistant Module-Lattice-Based Digital Signature Algorithm
 * 527: Post-Quantum Hybrid Key Exchange for TLS 1.3
 * 510: Key Derivation Function API
 * 524: PEM Encodings of Cryptographic Objects (Second Preview)
JFR:
 * 509: JFR CPU-Time Profiling (Experimental)
 * 520: JFR Method Timing & Tracing
 * 518: JFR Cooperative Sampling
And... transparent change:
517: HTTP/3 for the HTTP Client API

We started a talk per JDK on Bno JUG. You can see demos and explanations for all those:
JDK 22-25:  https://www.youtube.com/watch?v=UnA2jRVNb3M
JDK 26:     https://www.youtube.com/watch?v=ejhok_F3fHg
JDK 27:     coming at 9/2026
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Content
JEP														incubator/preview-finished/default	votes
 * 454: [Foreign Function & Memory API](https://openjdk.org/jeps/454)		(JDK 16/19-22)	(13%)
 * 485: [Stream Gatherers](https://openjdk.org/jeps/485) 					(JDK 22-24)		( 9%)
 * 513: [Flexible Constructor Bodies](https://openjdk.org/jeps/513)			(JDK 22-25)		( 7%)
 * 537: [Vector API (Twelfth Incubator)](https://openjdk.org/jeps/537)		(JDK 22-27)		( 6%)
 * 534: [Compact Object Headers by Default](https://openjdk.org/jeps/534)	(JDK 24-26/27)	( 6%)
 * 531: [Lazy Constants (Third Preview)]{https://openjdk.org/jeps/531}      (JDK 25-27)		( 5%)
 * 506: [Scoped Values](https://openjdk.org/jeps/506)						(JDK 20/21-25	( 5%)
 * 484: [Class-File API](https://openjdk.org/jeps/484)						(JDK 22-24)		( 5%)

+ 6% for String Templates and 12% for Ahead-of-Time Class Loading & Linking	= 75% of happy audience
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 454: Foreign Function & Memory API (13%)
 * https://openjdk.org/jeps/454
 * Incredible long history
   * incubator since JDK 16
   * preview since 19
   * stable since 22
 * Super simple "user interface"
https://github.com/openjdk/jextract ?
 Note the related
  * 472: [Prepare to Restrict the Use of JNI](https://openjdk.org/jeps/472) 24
    * Prepare the Java ecosystem for a future release that disallows interoperation with native code by default, whether via JNI or the FFM API. As of that release, application developers will have to explicitly enable the use of JNI and the FFM API at startup.
    * So its going to be much easier and faste.. but forbidden:)
  * proper calls to shared objects functions and to native memory
 but not only that  -the type wrap/unwrap was always so costly that people were using java.misc.unsafe for off-heap allocations (which should go away)
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 485: Stream Gatherers (9%)
 * https://openjdk.org/jeps/485
 * preview since JDK 22
 * stable since 24)
 * obvious high interest in streams
  * surprising lack of global knowledge?

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 513: Flexible Constructor Bodies (7%)
 * https://openjdk.org/jeps/513
 * preview since JDK 22
 * Stable since JDK 25

more "this" examples with parent/and real "this"

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 537: Vector API (Twelfth Incubator)
 * https://openjdk.org/jeps/537
 * preview since JDK 22
   * Still rollingThis will be resolved as part of upcoming security update , with unembargo (and relase date)  21.6.2026
 * SIMD
Comapre jdk25 26 and 27

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 534: Compact Object Headers by Default (6%)
 * https://openjdk.org/jeps/534
 * Experimental in JDK 24
see https://openjdk.org/jeps/450
 * Stable in JDK 25
  * -XX:+UnlockExperimentalVMOptions -XX:+UseCompactObjectHeaders
    over to unlock!
  maximal measuredimpacrt
  *  22% less heap space and 10% less CPU time.
 avarage imapce  15$ les hap 5% of CPU
 * Default since 27
   -XX:-UseCompactObjectHeaders ...

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 531: Lazy Constants (Third Preview) (5%)
 * {https://openjdk.org/jeps/531
 * First preview at JDK 25, rename in jdk 26 and again renamed in 27
 * performance improvements 25<26<27?
still rolling

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 506: Scoped Values (5%)
 * https://openjdk.org/jeps/506
 * Incubator in JDK 20
 * Preview since 21
 * Stable since 25	

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 484: Class-File API (5%)
 * https://openjdk.org/jeps/484
 * Preview since JDK 22
 * Stable since JDK 24
 * Not an competitor to BCEL, ASM or similar
  * do not mess up with JASM
 * An Complement
  * to make easily what ASM and friends have troubles to do
  * But generally be able to do anything

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Q?






Presentation written and presented in in weak-point:
 * https://github.com/tisnik/vim-weakpoint
