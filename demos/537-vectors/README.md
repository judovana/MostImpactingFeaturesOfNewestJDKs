## 508: [Vector API (Tenth Incubator)](https://openjdk.org/jeps/508) (25)

 * `/usr/lib/jvm/java-25-openjdk/bin/java --add-modules jdk.incubator.vector --enable-preview  --source 25  Main1.java`
   * https://docs.oracle.com/en/java/javase/26/docs/api/jdk.incubator.vector/jdk/incubator/vector/package-summary.html#class-summary
   * collections and arrays, primitives and autoboxing, vectors and Vectors(!)
 * `/usr/lib/jvm/java-25-openjdk/bin/java --add-modules jdk.incubator.vector --enable-preview  --source 25  Main2.java`
   * vectros x primitive arrays
   * simple operation
 * `/usr/lib/jvm/java-25-openjdk/bin/java --add-modules jdk.incubator.vector --enable-preview  --source 25  Main3.java`
   * vectros x primitive arrays
   * more complex operation
 * `/usr/lib/jvm/java-25-openjdk/bin/java --add-modules jdk.incubator.vector --enable-preview  --source 25  Main4.java`
   * vectros x primitive arrays
   * very complex operation

 * in 2 and 3
   * show the cpu sensitivity when `stress --cpu 16 --timeout 120`
   * show the non-jitted code:
```
    max=50000000;
    iter=1; //5!
    warms = 1;
```
   * will suddenly yeald (a lot with 5)


