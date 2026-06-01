#    Most Impacting Features Of Newest JDKs
###    Based on the survey of 242 replies

By Jiri Vanek from IBM's OpenJDK team.
19/6/2026 Devconnf 206, Brno




Only 7 JEPs made it to this talk, you can see the remaining 59 (34 - many are made in iterations)) at Brno JUG recording: https://www.youtube.com/watch?v=UnA2jRVNb3M (3hours!)

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
502: Stable Values (Preview)				(7)
******
500: Prepare to Make Final Mean Final		(7)
******
526: Lazy Constants (Second Preview)		(6)
******
530: Primitive Types in Patterns, instanceof, and switch (Fourth Preview)
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
483: Ahead-of-Time Class Loading & Linking:
 * at least some parts of it
 * Topic of itself:  https://www.youtube.com/watch?v=UnA2jRVNb3M&t=7237s
Big language improvements:
 * 485: Stream Gatherers
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
 * 526: Lazy Constants (Second Preview)
 * 530: Primitive Types in Patterns, instanceof, and switch (Fourth Preview)
 * 456: Unnamed Variables & Patterns
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# .. and what they do not care so much
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
# .. and what they do not care so much
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
# .. and what they do not care so much
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
# .. and what they do not care so much
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

We started a talk per JDK on Bno JUG. You can see demos aned explanations for all those:
jdk 22-25:  https://www.youtube.com/watch?v=UnA2jRVNb3M
jdk 26:     https://www.youtube.com/watch?v=ejhok_F3fHg
jdk27:      comming at 9/2026
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Content
 * 454: Foreign Function & Memory API
 * 485: Stream Gatherers
 * 484: Class-File API
 * 513: Flexible Constructor Bodies
 * 529: Vector API (Eleventh Incubator)
 * 519: Compact Object Headers
 * 506: Scoped Values
--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
#  454: Foreign Function & Memory API

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 485: Stream Gatherers

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 484: Class-File API

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
#  513: Flexible Constructor Bodies

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
#  529: Vector API (Eleventh Incubator)

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
#  519: Compact Object Headers

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# 506: Scoped Values

--PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE----PAGE---
# Q?






Presentation written and presented in in weak-point:
 * https://github.com/tisnik/vim-weakpoint
