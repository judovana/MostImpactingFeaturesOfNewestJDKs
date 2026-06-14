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
 * 534: [Compact Object Headers by Default](https://openjdk.org/jeps/534)	(JDK 24-26/27)	( 6%)
 * 537: [Vector API (Twelfth Incubator)](https://openjdk.org/jeps/537)		(JDK 22-27)		( 6%)
 * 531: [Lazy Constants (Third Preview)](https://openjdk.org/jeps/531)      (JDK 25-27)		( 5%)
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
 * "user interface" for calling native methods 
 * "user interface" for allocating of-heap memory (used by ^)
 * proper calls to generic objects functions and to native memory
  * no more 3rd party libraries to link non-c libraries
  * no more java.misc.unsafe
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 454: Foreign Function & Memory API 2/3
 * Demo!

 * Note the related:
  * 472: [Prepare to Restrict the Use of JNI](https://openjdk.org/jeps/472) 24
  * 471: [Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal](https://openjdk.org/jeps/471) 23
    * Prepare the Java ecosystem for a future release that disallows interoperation with native code by default, whether via JNI or the FFM API. As of that release, application developers will have to explicitly enable the use of JNI and the FFM API at startup.
    * disallow of java.misc.unsafe
    * So its going to be much easier and faster.. but forbidden:)
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 454: Foreign Function & Memory API 3/3
 * jdk8's javah
   * .class -> .h
 * javac -h
   * .java -> .h
     * => https://github.com/Glavo/gjavah/
     * .class -> .h
 * https://github.com/openjdk/jextract
  * .h -> .java
  * with proper FF and MA
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 485: Stream Gatherers (9%)
 * https://openjdk.org/jeps/485
 * preview since JDK 22
 * stable since 24
 * obvious high interest in streams
  * surprising lack of global knowledge?
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 485: Stream Gatherers 2/3
 * an extension point so that anyone could define **intermediate** chaining operations in  **infinite** streams
  * Track previously seen elements to influence the transformation of later elements
    * Stream::gather(Gatherer) 
  * gather() provides similar capabilities to intermediate **infinite** Stream as the collect() provides to **terminal** operations
    * interface Collector<T,A,R>
    * interface Gatherer<T,A,R>
  * ..only Gatherer is Stream->Stream
   * Gatherer uses an **Integrator** instead of a BiConsumer for per-element processing 
   * Gatherer uses a **BiConsumer** for its finisher instead of a Function 
     * as both it needs an extra input parameter for its Downstream object,
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 485: Stream Gatherers 3/3
 * Interface Collector<T,A,R>
   * T - the type of input elements to the reduction operation
   * A - the mutable accumulation type of the reduction operation (often hidden as an implementation detail)
   * R - the result type of the reduction operation 
 * Interface Gatherer<T,A,R>
   * T - the type of input elements to the gatherer operation
   * A - the potentially mutable state type of the gatherer operation (often hidden as an implementation detail)
   * R - the type of output elements from the gatherer operation 
 * Demo!

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 513: Flexible Constructor Bodies (7%)
 * https://openjdk.org/jeps/513
 * preview since JDK 22
 * Stable since JDK 25
 * JLS specification change
 * less restrictions
 * optimization
   * exit before all the code in `super()`
 * prologue and epilogue

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 513: Flexible Constructor Bodies 2/3
 * demo!
 * What about older vms?
 * The class still must defend itself against violations of its integrity
   * code before construction context must not use the instance under construction, except to initialize fields that do not have their own initializers.
   * code in an early construction context must not use `this` or `super`
     * except [simple assignment statements](https://docs.oracle.com/javase/specs/jls/se23/html/jls-15.html#jls-15.26.1)
     * `Record` classes even more restricted
   * inner class can refer to the instance of an enclosing class
     * instance of the enclosing class is created before the instance of the inner class
     * inner class — including constructor bodies — can access fields and invoke methods of the enclosing instance
     * constructor of outer class in the early construction context cannot instantiate the Inner class 
   * Valhalla (value classes without identity)) put `super()` at the end of the constructor
     * demo
     * TODO-PING aph/adinn why?
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 513: Flexible Constructor Bodies 3/3
What You CAN Do Before super()
 * Validate Arguments: You can validate incoming constructor parameters and throw exceptions immediately, avoiding unnecessary superclass allocation
 * Perform Computations: You can calculate complex arguments, parse strings, or run mathematical calculations needed for the super() call
 * Initialize Subclass Fields: You can directly assign values to fields declared within the subclass itself. This ensures that if the superclass constructor calls an overridden method, the subclass fields are already safely populated
 * Declare Local Variables: You can create temporary local variables to hold intermediate processing results
 * Call Static Methods: You can call static helper methods or utility functions
 * Execute Control Flow: You can use if-else blocks, loops and switches
What You CANNOT Do Before super()
 * Access this (Implicitly or Explicitly): You cannot reference the current object instance (e.g., passing this as a method argument)
 * Read Subclass/Superclass Instance Fields: You can assign values to subclass fields, but you cannot read them or read any superclass fields, because the object instance state is still considered uninitialized
 * Call Instance Methods: You can not invoke any non-static methods belonging to the subclass or superclass
 * Use try-catch Blocks: You can not wrap the super() call inside a try-catch block
 * You can not wrap the super() call inside a if-else block
Action										Allowed in Prologue
 * throw new (Runtime)Exception()			Yes
 * int x = Integer.parseInt(str);			Yes
 * this.subclassField = 10;					Yes (Write only)
   * Note, it can be initialized conditionally, based on arguments
 * System.out.println(this.subclassField);	No (Cannot read field)
 * this.someInstanceMethod();				No (Cannot call instance methods)
 * super.superclassField = 5;				No (Cannot modify parent yet)
Demo!

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 534: Compact Object Headers by Default (6%)
 * Started at RH at our Cubicle
	* Why some loads are better with OpenJ9? (around JDK..18?)
 * Experimental in JDK 24 - https://openjdk.org/jeps/450
   * -XX:+UnlockExperimentalVMOptions -XX:+UseCompactObjectHeaders
 * Stable in JDK 25 - https://openjdk.org/jeps/519
   * -XX:+UseCompactObjectHeaders
  * Default in 27 - https://openjdk.org/jeps/534
   * -XX:-UseCompactObjectHeaders ...
  * maximal measured impact
    * 22% less heap space and 10% less CPU time.
 * average impact 15% less hap 5% of CPU
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 534: Compact Object Headers by Default 2/2
 * **Each Object**  have an header.
    * Garbage collection — Storing forwarding pointers and tracking object ages;
    * Type system — Identifying an object's class, which is used for method invocation, reflection, type checks, etc.;
    * Locking — Storing information about associated light-weight and heavy-weight locks; and
    * Hash codes — Storing an object's stable identity hash code, once computed.
    * The current object header layout is split into a mark word and a class word. The mark word comes first, has the size of a machine address, and contains
  * And java application is a lot of short living small objects
  * Saving anything on each object would speed up everything from ram consumption to memory operations => performance
 * it was 98-128 bits in 64b JVM
  * Now it is 64b (and at least 4 spared for future.. for Valhalla)
```
For compact object headers, we remove the division between the mark and class words by subsuming the class pointer, in compressed form, into the mark word:
Header (compact):
64                    42                             11   7   3  0
 [CCCCCCCCCCCCCCCCCCCCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHVVVVAAAASTT]
 (Compressed Class Pointer)       (Hash Code)         /(GC Age)^(Tag)
                              (Valhalla-reserved bits) (Self Forwarded Tag)
```
 * Implement 32-bit object headers —  would likely involve implementing on-demand side storage for identity hash codes -  That is our ultimate goal.
 * Demo!
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 537: Vector API (Twelfth Incubator) ( 6%)
 * https://openjdk.org/jeps/537
 * preview since JDK 22
   * Still rolling!
 * SIMD
 * Compare JDK 25 x 27
   * no difference
 * each vector operates only with vector
 * primitives only
 * demo!
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 537: Vector API (Twelfth Incubator)  2/2
 * Current state
 * TODO-PING aph/adinn  - Why the delay? What is happening rght now?
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 531: Lazy Constants (Third Preview) (5%)
 * https://openjdk.org/jeps/531
 * First preview at JDK 25, rename in jdk 26 and again renamed in 27
 * performance improvements 25<26<27?
still rolling
TODO-PING aph/adinn  - Why the delay? What is happening rght now?
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
